package com.ambtestlab;

public class LoginPage {

    public static  By emailField = By.xpath("//label[text()='Email']//following-sibling::input[@id='email']");
    public static By emailText  = By.xpath("//input[@id='email']//preceding-sibling::label[text()='Email']");
    public static  By passwordField = By.xpath("//label[text()='Password']//following-sibling::input[@id='password']");
    public static  By passwordText = By.xpath("//input[@id='password']");
    public static  By loginBUTTON = By.xpath("//form[@id='loginForm']//button[@type='submit']");
    public static  By otpLogin    = By.xpath("//button[@id='otp-tab']");
    public static  By register    = By.xpath("//a[text()='Register']");













}
