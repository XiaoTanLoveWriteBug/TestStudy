package OASIS.until;


import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
//读表工具类
public class ExcelUtil {

    //将excel文件读取后转换为字符串返回为List<String[]>
    public static List<String[]> readExcel(String path) throws IOException {
        FileInputStream in=new FileInputStream(path);
        //获得工作簿对象
        Workbook workbook=new XSSFWorkbook(in);
        //用于记录每一行的数据
        List<String[]> list=new ArrayList<>();
        //判断对象不为空
        if(workbook != null) {
            //循环工作簿对象的每一个sheet对象
            for (int sheetNum = 0; sheetNum < workbook.getNumberOfSheets(); sheetNum++) {
                //获取当前工作表
                Sheet sheet = workbook.getSheetAt(sheetNum);
                //表为空去遍历下一个
                if(sheet == null){
                    continue;
                }
                //获取开始行数
                int firstRowNum = sheet.getFirstRowNum();
                //获取结尾行数
                int lastRowNum = sheet.getLastRowNum();
                //获取开始行
                Row firstRow = sheet.getRow(firstRowNum);
                //获取第一行开始列
                int firstCellNum = firstRow.getFirstCellNum();
                //获取最后一列
                int lastCellNum = firstRow.getLastCellNum();
                //遍历除了第一行的每一行
                for(int rowNum = firstRowNum+1; rowNum <= lastRowNum;rowNum++){
                    Row row = sheet.getRow(rowNum);
                    if(row == null){
                        continue;
                    }
                    String[] cells = new String[lastCellNum];
                    //遍历当前行的每一列
                    for(int cellNum = firstCellNum; cellNum < lastCellNum;cellNum++){
                        //得到当前列
                        Cell cell = row.getCell(cellNum);
                        //解析当前列的数据得到字符串
                        cells[cellNum] = getCellValue(cell);
                    }
                    list.add(cells);
                }
            }
        }
        return list;
    }

    /**
     * 解析每一列的数据成string
     * @param cell
     * @return
     */
    public static String getCellValue(Cell cell){
        String cellValue = "";
        if(cell == null){
            return cellValue;
        }
        //把数字当成String来读，避免出现1读成1.0的情况
        if(cell.getCellType() == Cell.CELL_TYPE_NUMERIC){
            cell.setCellType(Cell.CELL_TYPE_STRING);
        }
        //判断数据的类型
        switch (cell.getCellType()){
            case Cell.CELL_TYPE_NUMERIC: //数字
                cellValue = String.valueOf(cell.getNumericCellValue());
                break;
            case Cell.CELL_TYPE_STRING: //字符串
                cellValue = String.valueOf(cell.getStringCellValue());
                break;
            case Cell.CELL_TYPE_BOOLEAN: //Boolean
                cellValue = String.valueOf(cell.getBooleanCellValue());
                break;
            case Cell.CELL_TYPE_FORMULA: //公式
//                cellValue = String.valueOf(cell.getCellFormula());
                cellValue = String.valueOf(cell.getStringCellValue());
                break;
            case Cell.CELL_TYPE_BLANK: //空值
                cellValue = "";
                break;
            case Cell.CELL_TYPE_ERROR: //故障
                cellValue = "非法字符";
                break;
            default:
                cellValue = "未知类型";
                break;
        }
        return cellValue;
    }
}
