package untiltest;


import OASIS.until.ExcelUtil;
import io.qameta.allure.Feature;
import org.junit.jupiter.api.Test;
import org.testng.TestListenerAdapter;
import org.testng.annotations.Listeners;


import java.io.IOException;
import java.util.Iterator;
import java.util.List;

@Listeners({TestListenerAdapter.class})
public class test1 {

    @Test
    @Feature("步骤一")
    public void readexcel() throws IOException {

        String path = "C:\\Users\\jiangtan\\Desktop\\文档\\OASIS-15200.xlsx";
        ExcelUtil excelUtil = new ExcelUtil();
        List<String[]> list = excelUtil.readExcel(path);
        for (int i = 0; i < list.size(); i++) {
            String[] st = list.get(i);
            for (int j = 0; j < st.length; j++)
            {
                System.out.println(st[j]);
            }

        }


    }


}
