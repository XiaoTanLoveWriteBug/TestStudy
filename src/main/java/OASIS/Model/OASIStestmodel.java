package OASIS.Model;

import com.sun.istack.internal.NotNull;

public class OASIStestmodel {
    String Id;
    String Name;
    String Description;
    String Url;
    String RequestMethod;
    String RequestType;
    String UploadFileName;
    String RequestHeader;
    String RequestBady;
    String AssertedCode;
    String AssertedMessage;
    String AssertedResponseTime;
    String AssertedData;

    public OASIStestmodel(String id, String name, String description, String url, String requestMethod, String requestType, String uploadFileName, String requestHeader, String requestBady, String assertedCode, String assertedMessage, String assertedResponseTime, String assertedData) {
        Id = id;
        Name = name;
        Description = description;
        Url = url;
        RequestMethod = requestMethod;
        RequestType = requestType;
        UploadFileName = uploadFileName;
        RequestHeader = requestHeader;
        RequestBady = requestBady;
        AssertedCode = assertedCode;
        AssertedMessage = assertedMessage;
        AssertedResponseTime = assertedResponseTime;
        AssertedData = assertedData;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getUrl() {
        return Url;
    }

    public void setUrl(String url) {
        Url = url;
    }

    public String getRequestMethod() {
        return RequestMethod;
    }

    public void setRequestMethod(String requestMethod) {
        RequestMethod = requestMethod;
    }

    public String getRequestType() {
        return RequestType;
    }

    public void setRequestType(String requestType) {
        RequestType = requestType;
    }

    public String getUploadFileName() {
        return UploadFileName;
    }

    public void setUploadFileName(String uploadFileName) {
        UploadFileName = uploadFileName;
    }

    public String getRequestHeader() {
        return RequestHeader;
    }

    public void setRequestHeader(String requestHeader) {
        RequestHeader = requestHeader;
    }

    public String getRequestBady() {
        return RequestBady;
    }

    public void setRequestBady(String requestBady) {
        RequestBady = requestBady;
    }

    public String getAssertedCode() {
        return AssertedCode;
    }

    public void setAssertedCode(String assertedCode) {
        AssertedCode = assertedCode;
    }

    public String getAssertedMessage() {
        return AssertedMessage;
    }

    public void setAssertedMessage(String assertedMessage) {
        AssertedMessage = assertedMessage;
    }

    public String getAssertedResponseTime() {
        return AssertedResponseTime;
    }

    public void setAssertedResponseTime(String assertedResponseTime) {
        AssertedResponseTime = assertedResponseTime;
    }

    public String getAssertedData() {
        return AssertedData;
    }

    public void setAssertedData(String assertedData) {
        AssertedData = assertedData;
    }

    @Override
    public String toString() {
        return "OASIStestmodel{" +
                "Id='" + Id + '\'' +
                ", Name='" + Name + '\'' +
                ", Description='" + Description + '\'' +
                ", Url='" + Url + '\'' +
                ", RequestMethod='" + RequestMethod + '\'' +
                ", RequestType='" + RequestType + '\'' +
                ", UploadFileName='" + UploadFileName + '\'' +
                ", RequestHeader='" + RequestHeader + '\'' +
                ", RequestBady='" + RequestBady + '\'' +
                ", AssertedCode='" + AssertedCode + '\'' +
                ", AssertedMessage='" + AssertedMessage + '\'' +
                ", AssertedResponseTime='" + AssertedResponseTime + '\'' +
                ", AssertedData='" + AssertedData + '\'' +
                '}';
    }
}
