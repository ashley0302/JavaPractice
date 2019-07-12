package org.dimigo.inheritance;

public abstract class Smartphone
{
    private String model;
    private String company;
    private int price;

    public Smartphone() {

    }

    public Smartphone(String model, String company, int price) {
        this.model = model;
        this.company = company;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void turnOn(){
        System.out.println(model+"의 전원을 켭니다.");
    }
    public void turnOff(){
        System.out.println(model + "의 전원을 끕니다.");
    }
    public abstract void pay();
    public void useSpecialFunction(){
        if(this instanceof Iphone){
            ((Iphone) this).useAirDrop();
        }
        else if(this instanceof Galaxy){
            ((Galaxy) this).useWirelessCharging();
        }
    }
    @Override
    public String toString() {
        return "모델명 : "+getModel()+", 제조사: "+getCompany()+", 가격 : "+ String.format("%,d",getPrice())+"원";
    }





}
