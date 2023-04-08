package Coding.Java;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        int answer1,answer2,decimal,torestart=0;
        String num1,result;
        String[] buttons={"Binary","Hex","Decimal"};

       while(torestart==0){
        answer1 = JOptionPane.showOptionDialog(null,"Select the number type you want to convert.", "SmartConverter",JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE,null,buttons,0);
        
        switch(answer1){
            case -1:
                System.exit(0);
            case 0: //From Binary
                num1 = JOptionPane.showInputDialog(null, "Give the number you want to convert.");
                System.out.println(num1);
                answer2 = JOptionPane.showOptionDialog(null,"Select the number type you want to convert to.", "SmartConverter",JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE,null,buttons,0);
                
                switch(answer2){
                    case 0: //To binary
                        JOptionPane.showMessageDialog(null,"Please select different type.", "SmartConverter", JOptionPane.ERROR_MESSAGE);
                    break;
                    case 1: //To Hex
                        try{
                        decimal = Integer.parseInt(num1,2);
                        result = Integer.toHexString(decimal);
                        }catch(NumberFormatException e){
                            JOptionPane.showMessageDialog(null,"Please enter a valid number", "SmartConverter", JOptionPane.ERROR_MESSAGE);
                            break;
                        }
                        JOptionPane.showMessageDialog(null,"Binary:"+num1+"\nTo Hex:"+result, "SmartConverter", JOptionPane.PLAIN_MESSAGE);
                    break;
                    case 2: //To decimal
                        try{
                            decimal = Integer.parseInt(num1,2);
                        }catch(NumberFormatException e){
                            JOptionPane.showMessageDialog(null,"Please enter a valid number", "SmartConverter", JOptionPane.ERROR_MESSAGE);
                            break;
                        }
                        JOptionPane.showMessageDialog(null,"Binary:"+num1+"\nTo Decimal:"+decimal, "SmartConverter", JOptionPane.PLAIN_MESSAGE);
                        break;
                        case -1:
                            System.exit(0);
                        default: 
                            break;
            }
            break;

            case 1: //From hex
            num1 = JOptionPane.showInputDialog(null, "Give the number you want to convert.");
            answer2 = JOptionPane.showOptionDialog(null,"Select the number type you want to convert to.", "SmartConverter",JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE,null,buttons,0);
                switch(answer2){
                    case 0: //To binary
                        try{
                            decimal = Integer.parseInt(num1,16);
                            result = Integer.toBinaryString(decimal);
                        }catch(NumberFormatException e){
                            JOptionPane.showMessageDialog(null,"Please enter a valid number", "SmartConverter", JOptionPane.ERROR_MESSAGE);
                            break;
                        }
                        JOptionPane.showMessageDialog(null,"Hex:"+num1+"\nTo Binary: "+result, "SmartConverter", JOptionPane.PLAIN_MESSAGE);
                    break;
                    case 1: //To Hex
                        JOptionPane.showMessageDialog(null,"Please select different type.", "SmartConverter", JOptionPane.ERROR_MESSAGE);
                    break;
                    case 2: //To decimal
                        try{
                            decimal = Integer.parseInt(num1,16);
                        }catch(NumberFormatException e){
                            JOptionPane.showMessageDialog(null,"Please enter a valid number", "SmartConverter", JOptionPane.ERROR_MESSAGE);
                            break;
                        }
                        JOptionPane.showMessageDialog(null,"Hex:"+num1+"\nTo Decimal:"+decimal, "SmartConverter", JOptionPane.PLAIN_MESSAGE);
                    break;
                    case -1:
                        System.exit(0);
                    default: 
                        break;
                }
            break;
            case 2: //From Decimal
                num1 = JOptionPane.showInputDialog(null, "Give the number you want to convert.");
                answer2 = JOptionPane.showOptionDialog(null,"Select the number type you want to convert to.", "SmartConverter",JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE,null,buttons,0);
                switch(answer2){
                    case -1:
                        System.exit(0);
                    case 0: //To binary
                        try{
                            decimal = Integer.parseInt(num1);
                            result = Integer.toBinaryString(decimal);
                        }catch(NumberFormatException e){
                            JOptionPane.showMessageDialog(null,"Please enter a valid number", "SmartConverter", JOptionPane.ERROR_MESSAGE);
                        break;
                        }
                        JOptionPane.showMessageDialog(null,"Decimal:"+num1+"\nTo Binary: "+result, "SmartConverter", JOptionPane.PLAIN_MESSAGE);
                    break;
                    case 1: //To Hex
                       try{
                        decimal=Integer.parseInt(num1);
                        result=Integer.toHexString(decimal);
                    }catch(NumberFormatException e){
                        JOptionPane.showMessageDialog(null,"Please enter a valid number", "SmartConverter", JOptionPane.ERROR_MESSAGE);
                        break;
                    }
                       JOptionPane.showMessageDialog(null,"Decimal:"+num1+"\nTo Hex: "+result, "SmartConverter", JOptionPane.PLAIN_MESSAGE);
                    break;
                    case 2: //To decimal
                        JOptionPane.showMessageDialog(null,"Please select different type.", "SmartConverter", JOptionPane.ERROR_MESSAGE);
                    break;
                    default: 
                        break;
                }
            default:
                break;         
    }
    torestart = JOptionPane.showOptionDialog(null,"Do you want to restart?", "SmartConverter",JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE,null,null,0);
       
        }
    }
}