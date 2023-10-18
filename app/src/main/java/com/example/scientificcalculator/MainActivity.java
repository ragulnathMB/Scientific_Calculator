package com.example.scientificcalculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    TextView textView2;
    // c pi delete deg fact root dot
    Button button;

    public static Button c,sin,tan,cos,e,pi,power,equal,plus,minus,divide,multi,log,ln,delete,deg,fact,root,dot,brl,brr,atan,asin,acos,onebyx,blank;
    Button one,two,three,four,five,six,seven,eight,nine,zero;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=findViewById(R.id.textView2);
        textView2=findViewById(R.id.textView3);
        c=findViewById(R.id.button);
        delete=findViewById(R.id.button2);
        deg=findViewById(R.id.button3);
        pi=findViewById(R.id.button4);
        sin=findViewById(R.id.button5);
        cos=findViewById(R.id.button6);
        tan=findViewById(R.id.button7);
        fact=findViewById(R.id.button8);
        log=findViewById(R.id.button9);
        seven=findViewById(R.id.button10);
        eight=findViewById(R.id.button11);
        nine=findViewById(R.id.button12);
        multi=findViewById(R.id.button13);
        ln=findViewById(R.id.button14);
        four=findViewById(R.id.button16);
        five=findViewById(R.id.button15);
        six=findViewById(R.id.button17);
        minus=findViewById(R.id.button18);
        root=findViewById(R.id.button19);
        one=findViewById(R.id.button20);
        two=findViewById(R.id.button21);
        three=findViewById(R.id.button22);
        divide=findViewById(R.id.button23);
        e=findViewById(R.id.button24);
        dot=findViewById(R.id.button25);
        zero=findViewById(R.id.button26);
        plus=findViewById(R.id.button27);
        power=findViewById(R.id.button28);
        equal=findViewById(R.id.button30);
        brl=findViewById(R.id.button31);
        brr=findViewById(R.id.button32);
        asin=findViewById(R.id.button34);
        atan=findViewById(R.id.button35);
        acos=findViewById(R.id.button33);
        onebyx=findViewById(R.id.button37);

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText()+"1");
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText()+"2");
            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText()+"3");
            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText()+"4");
            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText()+"5");
            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText()+"6");
            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText()+"7");
            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText()+"8");
            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText()+"9");
            }
        });

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText()+"0");
            }
        });

        sin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText()+"sin(");
            }
        });

        cos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText()+"cos(");
            }
        });

        tan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText()+"tan(");
            }
        });

        brl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText()+"(");
            }
        });

        brr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText()+")");
            }
        });

        e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText()+"10^");
            }
        });

        log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText()+"log(");
            }
        });

        ln.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText()+"ln(");
            }
        });

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText()+"+");
            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText()+"-");
            }
        });

        multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText()+"*");
            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText()+"/");
            }
        });

        power.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText()+"^");
            }
        });
        // delete dot
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("");
                textView2.setText("0");
            }
        });

        pi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText()+"3.14159265");
            }
        });

        root.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText()+"sqrt(");
            }
        });

        fact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText()+"fact(");
            }
        });

        deg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(deg.getText()== "deg"){
                    deg.setText("rad");
                }else{
                    deg.setText("deg");
                }
            }
        });

        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText()+".");
            }
        });

        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(textView.getText().length()==0){
                    return;
                }
                String data=textView.getText().toString();
                data=data.substring(0,data.length()-1);
                textView.setText(data);
            }
        });

        asin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText()+"asin(");
            }
        });

        atan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText()+"atan(");
            }
        });

        acos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText()+"acos(");
            }
        });
        onebyx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText()+"1/");
            }
        });

        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val = textView.getText().toString();
                String replacedstr = val;
                double result = eval(replacedstr);
                textView2.setText(String.valueOf(result));
                textView.setText(val);
            }
        });


    }





    //eval function
    public static double eval(final String str) {
        return new Object() {
            int pos = -1, ch;

            void nextChar() {
                ch = (++pos < str.length()) ? str.charAt(pos) : -1;
            }
            double factorial(double n) {
                if(n==1 || n==0){
                    return 1;
                }
                return n*factorial(n-1);
            }

            boolean eat(int charToEat) {
                while (ch == ' ') nextChar();
                if (ch == charToEat) {
                    nextChar();
                    return true;
                }
                return false;
            }

            double parse() {
                nextChar();
                double x = parseExpression();
                if (pos < str.length()) throw new RuntimeException("Unexpected: " + (char)ch);
                return x;
            }

            // Grammar:
            // expression = term | expression `+` term | expression `-` term
            // term = factor | term `*` factor | term `/` factor
            // factor = `+` factor | `-` factor | `(` expression `)`
            //        | number | functionName factor | factor `^` factor

            double parseExpression() {
                double x = parseTerm();
                for (;;) {
                    if      (eat('+')) x += parseTerm(); // addition
                    else if (eat('-')) x -= parseTerm(); // subtraction
                    else return x;
                }
            }

            double parseTerm() {
                double x = parseFactor();
                for (;;) {
                    if      (eat('*')) x *= parseFactor(); // multiplication
                    else if (eat('/')) x /= parseFactor(); // division
                    else return x;
                }
            }

            double parseFactor() {
                if (eat('+')) return parseFactor(); // unary plus
                if (eat('-')) return -parseFactor(); // unary minus

                double x;
                int startPos = this.pos;
                if (eat('(')) { // parentheses
                    x = parseExpression();
                    eat(')');
                } else if ((ch >= '0' && ch <= '9') || ch == '.') { // numbers
                    while ((ch >= '0' && ch <= '9') || ch == '.') nextChar();
                    x = Double.parseDouble(str.substring(startPos, this.pos));
                } else if (ch >= 'a' && ch <= 'z') { // functions
                    while (ch >= 'a' && ch <= 'z') nextChar();
                    String func = str.substring(startPos, this.pos);
                    x = parseFactor();
//                    if (func.equals("sqrt")) x = Math.sqrt(x);
//                    else if (func.equals("sin")) x = Math.sin(Math.toRadians(x));
//                    else if (func.equals("cos")) x = Math.cos(Math.toRadians(x));
//                    else if (func.equals("tan")) x = Math.tan(Math.toRadians(x));
//                    else if (func.equals("tani")) x= Math.toDegrees(Math.atan(x));
//                    else if (func.equals("log")) x = Math.log10(x);
//                    else if (func.equals("ln")) x = Math.log(x);
                    switch (func) {
                        case "sqrt":
                            x = Math.sqrt(x);
                            break;
                        case "sin":
                            if (deg.getText() == "rad") {
                                x = Math.sin(x);
                            } else {
                                x = Math.sin(Math.toRadians(x));
                            }
                            break;
                        case "cos":
                            if (deg.getText() == "rad") {
                                x = Math.cos(x);
                            } else {
                                x = Math.cos(Math.toRadians(x));
                            }
                            break;
                        case "tan":
                            if (deg.getText() == "rad") {
                                x = Math.tan(x);
                            } else {
                                x = Math.tan(Math.toRadians(x));
                            }
                            break;
                        case "atan":
                            if (deg.getText() == "rad") {
                                x = Math.atan(x);
                            } else {
                                x = Math.toDegrees(Math.atan(x));
                            }
                            break;
                        case "asin":
                            if (deg.getText() == "rad") {
                                x = Math.asin(x);
                            } else {
                                x = Math.toDegrees(Math.asin(x));
                            }
                            break;
                        case "acos":
                            if (deg.getText() == "rad") {
                                x = Math.acos(x);
                            } else {
                                x = Math.toDegrees(Math.acos(x));
                            }
                            break;
                        case "log":
                            x = Math.log10(x);
                            break;
                        case "ln":
                            x = Math.log(x);
                            break;
                        case "fact":
                            x=factorial(x);
                            break;
                        default:
                            throw new RuntimeException("Unknown function: " + func);
                    }
                } else {
                    throw new RuntimeException("Unexpected: " + (char)ch);
                }

                if (eat('^')) x = Math.pow(x, parseFactor()); // exponentiation

                return x;
            }
        }.parse();
    }



}