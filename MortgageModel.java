package com.awkhan94.mcalc;

public class MortgageModel {

    private double principle;
    private double amortization;
    private double interest;

    public MortgageModel(String p, String a, String i) {

        this.principle = Double.parseDouble(p);
        this.amortization = Double.parseDouble(a);
        this.interest = Double.parseDouble(i);
    }

    public String computePayment()
    {
        double i = ((this.interest/100)/12);
        double a = ((this.amortization * 12))*(-1);
        double mPayment = ((i * this.principle)/(1 - Math.pow(i+1,a)));
        String result = String.format("$%,.2f", mPayment);
//        String result = Double.toString(mPayment) ;
        return result;
    }

    public static void main(String[] args) {
        MortgageModel myModel = new MortgageModel("700000","25","2.75");
        System.out.println(myModel.computePayment());

        myModel = new MortgageModel("300000","20","4.50");
        System.out.println(myModel.computePayment());
    }

}
