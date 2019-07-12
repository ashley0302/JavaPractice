package org.dimigo.oop;

public class PiggyBankTest {
    public static void main(String[] args) {
        FamilyMember m = new FamilyMember("엄마");
        FamilyMember d = new FamilyMember("아빠");
        FamilyMember b = new FamilyMember("남동색");
        FamilyMember i = new FamilyMember("나");

        FamilyMember.printMemberCnt();
        PiggyBank.putMoney(d,10000);
        PiggyBank.putMoney(m,5000);
        PiggyBank.putMoney(i,2000);
        PiggyBank.putMoney(b,1000);
        PiggyBank.printBalance();
        PiggyBank.putMoney(i,1000);
        PiggyBank.printBalance();

    }
}
