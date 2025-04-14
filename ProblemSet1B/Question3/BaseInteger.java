package ProblemSet1B.Question3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class BaseInteger {

    private String representation;
    private int base;

    private int[] digits;
    private int decimalValue;

    //////////////////
    // Constructors //
    //////////////////
    // The 2-arg Constructor
    BaseInteger( String representation, int base){
        // System.out.println("BaseInteger 2-Arg Constructor");
        this.representation = deleteSpaces(representation);
        this.base = base;
        convertRepresentationToArray();
        setDecimalValue();
    }


    /////////////////////////////
    // Accessor/getter methods //
    /////////////////////////////
    public int getDecimalValue() {

        return decimalValue;
    }

    public String getDigitsString(){

        return Arrays.toString(digits);
    }


    /////////////////////////////
    // Mutuator/setter methods //
    /////////////////////////////
    private void setDecimalValue(){
        int total = 0;
//        System.out.println(Arrays.toString(this.digits));

        for (int i = 0; i < this.digits.length; i++){

            int power = this.digits.length-i-1;
            int powerTerm = (int) Math.pow(this.base, power); // Compute base^power correctly

            total = total + (this.digits[i] * powerTerm);
            }

        this.decimalValue = total;

    }


    //////////////////////
    // Instance Methods //
    //////////////////////
    private void convertRepresentationToArray(){

        String[] stringArray = this.representation.split(",");
        int[] intArray = new int[stringArray.length];

        for (int i = 0; i < stringArray.length; i++){
            int intElement = Integer.parseInt(stringArray[i]);
            intArray[i] = intElement;
        }

//        System.out.println(this.representation);
//        System.out.println(Arrays.toString(stringArray));
//        System.out.println(Arrays.toString(intArray));
        this.digits = intArray;

    }

    public BaseInteger add(BaseInteger other, int base){
        int total = this.decimalValue + other.decimalValue;
        String representationString = "";

        String addedRepresentationString = convertBase(total, base);

        BaseInteger newBaseInteger = new BaseInteger(addedRepresentationString, base);
        newBaseInteger.convertRepresentationToArray();

        return newBaseInteger;
    }

    private String convertBase(int decimalValue, int base){
        ArrayList<Integer> digitsArrayList = new ArrayList<>();

        int power = 0;
        boolean exitWhileLoop = false;

        while (exitWhileLoop == false) {
            int powerTerm = (int) Math.pow(base, power); // Compute base^power correctly

            if (powerTerm > decimalValue) {
                power--;
                exitWhileLoop = true;
            } else {
                power++;
            }
        }

        while (power != -1){
            int divisionResult = decimalValue / ((int) Math.pow(base, power));
            decimalValue = decimalValue - (((int) Math.pow(base, power)) * (divisionResult));
            power--;

            if (power > -1){
                digitsArrayList.add(divisionResult);
            } else{
                digitsArrayList.add(divisionResult);
            }
        }

        StringBuilder representationStringBuilder = new StringBuilder();

        for (int i : digitsArrayList) {
            representationStringBuilder.append(i).append(",");
        }

        // Remove the last comma if there is at least one element
        if (!digitsArrayList.isEmpty()) {
            representationStringBuilder.setLength(representationStringBuilder.length() - 1);
        }

        String representationString = representationStringBuilder.toString();

        return representationString;
    }

    private String deleteSpaces( String representation){

        return representation.replaceAll(" ", "");
    }

    @Override
    public String toString() {
        return representation + " Base " + base;
    }
}
