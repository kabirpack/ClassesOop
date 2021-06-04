package com.interfacesPhoneScenario;

public class PhoneMain {
    public static void main(String[] args){
        ITelephone kabPhone; //abstraction
        kabPhone = new DeskPhone(264585); //implementing as desk phone
        kabPhone.powerOn();
        kabPhone.callPhone(243455);
        kabPhone.answer();

        kabPhone = new MobilePhone(989849596); // implementing as mobile phone
        kabPhone.powerOn();
        kabPhone.callPhone(983948556);
        kabPhone.answer();
    }
}
