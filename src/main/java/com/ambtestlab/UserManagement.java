package com.ambtestlab;

public class UserManagement {

    public class UserManagement {
        public static  By USER_NAME             = By.xpath("//h5[@class='mb-1 fw-bold']");
        public static  By EMAIL                 = By.xpath("//p[@class='text-muted mb-0 small']");
        public static  By MOBILE                = By.xpath("//div[@class='row g-2']");
        public static  By LOCATION              = By.xpath("//div[contains(@class,'mb-3') and contains(@class,'pb-3') and contains(@class,'border-bottom')]");
        public static  By REGISTRATION_DATE     = By.xpath("//div[@class='mb-2']");
        public static  By LAST_LOGIN            = By.xpath("//span[@class='small']");
        public static  By DELETE_BUTTON         = By.xpath("//button[@title='Delete User']");
        public static  By REGISTERED_USER       = By.xpath("//span[@class='badge bg-primary']");
        public static  By USER_TABLE            = By.xpath("//table//tbody//tr//td");
        public static  By USER_TABLE_ROWS       = By.xpath("//table//tbody//tr");
        public static  By ROW_USERNAME_DATA     = By.xpath("//table//tbody//tr//td[2]");
        public static  By ROW_EMAIL_DATA        = By.xpath("//table//tbody//tr//td[3]");
        public static  By ROW_MOBILE_DATA       = By.xpath("//table//tbody//tr//td[4]");
        public static By ROW_LOCATION_DATA      = By.xpath("//table//tbody//tr//td[5]");
        public static  By ROW_REGISTERED_DATA   = By.xpath("//table//tbody//tr//td[6]");
        public static  By ROW_ACTIONS_DATA      = By.xpath("//table//tbody//tr//td[7]");
        public static  By CONFIRM_DELETE_DATA   = By.xpath("//td//button");
        public static  By ROW_HEADER_USERNAME   = By.xpath("//table[@id='usersTable']//tr//th[1]");
        public static  By ROW_HEADER_EMAIL      = By.xpath("//table[@id='usersTable']//tr//th[2]");
        public static By ROW_HEADER_MOBILE      = By.xpath("//table[@id='usersTable']//tr//th[3]");
        public static  By ROW_HEADER_LOCATION   = By.xpath("//table[@id='usersTable']//tr//th[4]");
        public static  By ROW_HEADER_REGISTERED = By.xpath("//table[@id='usersTable']//tr//th[5]");
        public static  By ROW_HEADER_ACTIONS    = By.xpath("//table[@id='usersTable']//tr//th[6]");
    }
















}
