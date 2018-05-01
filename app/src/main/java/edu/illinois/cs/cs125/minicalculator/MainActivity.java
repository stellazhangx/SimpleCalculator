package edu.illinois.cs.cs125.minicalculator;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.faendir.rhino_android.RhinoAndroidHelper;

import org.mozilla.javascript.Scriptable;



import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    //Declare variables
    Button btnClear;
    TextView tvProcessor, tvResult;

    Button btnOne, btnTwo, btnThree, btnFour, btnFive, btnSix, btnSeven, btnEight, btnNine, btnZero;
    String processor;
    Boolean isSmallBracketOpen;
    Button btnMultiply, btnMinus, btnPlus, btnDivide, btnDecimal, btnBack, btnSmallBracket,
            btnEqual, btnPercentage;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        isSmallBracketOpen = false;

        //Assign variables
        btnClear = (Button) findViewById(R.id.btn_delete);
        tvProcessor = (TextView) findViewById(R.id.tv_process);
        tvResult = (TextView) findViewById(R.id.tv_result);


        tvProcessor.setText("");
        tvResult.setText("");


        btnOne = (Button) findViewById(R.id.btn_one);
        btnTwo = (Button) findViewById(R.id.btn_two);
        btnThree = (Button) findViewById(R.id.btn_three);
        btnFour = (Button) findViewById(R.id.btn_four);
        btnFive = (Button) findViewById(R.id.btn_five);
        btnSix = (Button) findViewById(R.id.btn_six);
        btnSeven = (Button) findViewById(R.id.btn_seven);
        btnEight = (Button) findViewById(R.id.btn_eight);
        btnNine = (Button) findViewById(R.id.btn_nine);
        btnZero = (Button) findViewById(R.id.btn_zero);



        btnMultiply = (Button) findViewById(R.id.btn_multiply);
        btnMinus = (Button)findViewById(R.id.btn_minus);
        btnPlus = (Button) findViewById(R.id.btn_plus);
        btnDivide = (Button) findViewById(R.id.btn_divide);


        btnDecimal = (Button) findViewById(R.id.btn_dot);

        btnBack = (Button) findViewById(R.id.btn_back);


        btnSmallBracket = (Button) findViewById(R.id.btn_small_bracket);

        btnEqual = (Button) findViewById(R.id.btn_equal);
        btnPercentage = (Button) findViewById(R.id.btn_percentage);

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvProcessor.setText("");
                tvResult.setText("");
            }

        });



        //Number Buttons on-Click
        btnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                processor = tvProcessor.getText().toString();
                tvProcessor.setText(processor + "1");
            }
        });
        btnTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                processor = tvProcessor.getText().toString();
                tvProcessor.setText(processor + "2");
            }
        });
        btnThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                processor = tvProcessor.getText().toString();
                tvProcessor.setText(processor + "3");
            }
        });
        btnFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                processor = tvProcessor.getText().toString();
                tvProcessor.setText(processor + "4");
            }
        });
        btnFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                processor = tvProcessor.getText().toString();
                tvProcessor.setText(processor + "5");
            }
        });
        btnSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                processor = tvProcessor.getText().toString();
                tvProcessor.setText(processor + "6");
            }
        });
        btnSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                processor = tvProcessor.getText().toString();
                tvProcessor.setText(processor + "7");
            }
        });
        btnEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                processor = tvProcessor.getText().toString();
                tvProcessor.setText(processor + "8");
            }
        });
        btnNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                processor = tvProcessor.getText().toString();
                tvProcessor.setText(processor + "9");
            }
        });
        btnZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                processor = tvProcessor.getText().toString();
                tvProcessor.setText(processor + "0");
            }
        });



        //Function Buttons on-Click
        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                processor = tvProcessor.getText().toString();
                tvProcessor.setText(processor + "X");
            }
        });
        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                processor = tvProcessor.getText().toString();
                tvProcessor.setText(processor + "-");
            }
        });
        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                processor = tvProcessor.getText().toString();
                tvProcessor.setText(processor + "+");
            }
        });
        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                processor = tvProcessor.getText().toString();
                tvProcessor.setText(processor + "/");
            }
        });

        btnDecimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                processor = tvProcessor.getText().toString();
                tvProcessor.setText(processor + ".");
            }
        });

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                processor = tvProcessor.getText().toString();
                if(processor.length() > 0) {
                    processor = processor.substring(0, processor.length()-1);
                    tvProcessor.setText(processor);
                }
            }
        });

        btnSmallBracket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isSmallBracketOpen) {
                    processor = tvProcessor.getText().toString();
                    tvProcessor.setText(processor + ")");
                    isSmallBracketOpen = false;
                } else {
                    processor = tvProcessor.getText().toString();
                    tvProcessor.setText(processor + "(");
                    isSmallBracketOpen = true;
                }
            }
        });

        //Equal Button on-Click
        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                processor = tvProcessor.getText().toString();

                processor = processor.replaceAll("X", "*");
                processor = processor.replaceAll("%", "/100");



                org.mozilla.javascript.Context rhino = org.mozilla.javascript.Context.enter();
                rhino.setOptimizationLevel(-1);
                String result = "";
                try{
                    Scriptable scope = rhino.initStandardObjects();
                    result = rhino.evaluateString(scope, processor, "JavaScript", 1, null).toString();
                } catch (Exception e) {
                    result = "Error";
                }
                tvResult.setText(result);

            }
        });

        btnPercentage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                processor = tvProcessor.getText().toString();
                tvProcessor.setText(processor + "%");
            }
        });
    }
}
