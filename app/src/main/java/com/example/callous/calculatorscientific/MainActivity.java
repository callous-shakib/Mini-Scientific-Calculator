package com.example.callous.calculatorscientific;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText txtAnswer;
    Button but1,but2,but3,but4,but5,but6,but7,but8,but9,but10,butdot,butce,butc;
    Button butadd,butsub,butmul,butdiv,butcos,butsin,buttan,butpow,butsqr,butrad,butdeg,butlog,butper,butequ;
    Double  Answer;Double Val2=0.0;Double Val1=0.1;
    String Sign; boolean solved=false; boolean solveWithouEqu = false;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
           AddOnclickListenersForButton();
    }

    private void AddOnclickListenersForButton(){
        txtAnswer =(EditText) findViewById(R.id.txtAnswer);
        but1=(Button) findViewById(R.id.but1);
        but2=(Button) findViewById(R.id.but2);
        but3=(Button) findViewById(R.id.but3);
        but4=(Button) findViewById(R.id.but4);
        but5=(Button) findViewById(R.id.but5);
        but6=(Button) findViewById(R.id.but6);
        but7=(Button) findViewById(R.id.but7);
        but8=(Button) findViewById(R.id.but8);
        but9=(Button) findViewById(R.id.but9);
        but10=(Button) findViewById(R.id.but10);
        butdot=(Button) findViewById(R.id.butdot);
        butce=(Button) findViewById(R.id.butce);
        butc=(Button) findViewById(R.id.butc);
        butadd=(Button) findViewById(R.id.butadd);
        butsub=(Button) findViewById(R.id.butsub);
        butmul=(Button) findViewById(R.id.butmul);
        butdiv=(Button) findViewById(R.id.butdiv);

        butcos=(Button) findViewById(R.id.butcos);
        butsin=(Button) findViewById(R.id.butsin);
        buttan=(Button) findViewById(R.id.buttan);
        butpow=(Button) findViewById(R.id.butpow);
        butsqr=(Button) findViewById(R.id.butsqr);
        butrad=(Button) findViewById(R.id.butrad);
        butdeg=(Button) findViewById(R.id.butdeg);
        butlog=(Button) findViewById(R.id.butlog);
        butper=(Button) findViewById(R.id.butper);
        butequ=(Button) findViewById(R.id.butequ);


         but1.setOnClickListener(new View.OnClickListener(){
             @Override
             public void onClick(View v){
            if (solved = true ||solveWithouEqu == true) {
                txtAnswer.setText("");
                solved = false;
                solveWithouEqu = false;
            }
            txtAnswer.setText(txtAnswer.getText().toString() + but1.getText().toString());
        }
         });
        but1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if (solved = true ||solveWithouEqu == true) {
                    txtAnswer.setText("");
                    solved = false;
                    solveWithouEqu = false;
                }
                txtAnswer.setText(txtAnswer.getText().toString() + but1.getText().toString());
            }
        });
        but2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if (solved = true ||solveWithouEqu == true) {
                    txtAnswer.setText("");
                    solved = false;
                    solveWithouEqu = false;
                }
                txtAnswer.setText(txtAnswer.getText().toString() + but2.getText().toString());
            }
        });
        but3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if (solved = true ||solveWithouEqu == true) {
                    txtAnswer.setText("");
                    solved = false;
                    solveWithouEqu = false;
                }
                txtAnswer.setText(txtAnswer.getText().toString() + but3.getText().toString());
            }
        });
        but4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if (solved = true ||solveWithouEqu == true) {
                    txtAnswer.setText("");
                    solved = false;
                    solveWithouEqu = false;
                }
                txtAnswer.setText(txtAnswer.getText().toString() + but4.getText().toString());
            }
        });
        but5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if (solved = true ||solveWithouEqu == true) {
                    txtAnswer.setText("");
                    solved = false;
                    solveWithouEqu = false;
                }
                txtAnswer.setText(txtAnswer.getText().toString() + but5.getText().toString());
            }
        });
        but6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if (solved = true ||solveWithouEqu == true) {
                    txtAnswer.setText("");
                    solved = false;
                    solveWithouEqu = false;
                }
                txtAnswer.setText(txtAnswer.getText().toString() + but6.getText().toString());
            }
        });
        but7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if (solved = true ||solveWithouEqu == true) {
                    txtAnswer.setText("");solved = false;solveWithouEqu = false;}
                txtAnswer.setText(txtAnswer.getText().toString() + but7.getText().toString());
            }
        });
        but8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if (solved = true ||solveWithouEqu == true) {txtAnswer.setText("");solved = false;solveWithouEqu = false;}
                txtAnswer.setText(txtAnswer.getText().toString() + but8.getText().toString());
            }
        });
        but9.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if (solved = true ||solveWithouEqu == true) {
                    txtAnswer.setText("");solved = false;solveWithouEqu = false;
                }
                txtAnswer.setText(txtAnswer.getText().toString() + but9.getText().toString());
            }
        });
        but10.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if (solved = true ||solveWithouEqu == true) {
                    txtAnswer.setText("");
                    solved = false;
                    solveWithouEqu = false;
                }
                txtAnswer.setText(txtAnswer.getText().toString() + but10.getText().toString());
            }
        });
        butdot.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if (solved = true ||solveWithouEqu == true) {
                    txtAnswer.setText("");
                    solved = false;
                    solveWithouEqu = false;
                }
                txtAnswer.setText(txtAnswer.getText().toString() + butdot.getText().toString());
            }
        });


        butadd.setOnClickListener(new View.OnClickListener() {
        @Override
            public void onClick(View V) {
            try {
                if (Val2 == 0.0) {
                    Val1 = Double.parseDouble(txtAnswer.getText().toString());
                    txtAnswer.setText("");
                    Sign = "+";
                    Val2 = Double.parseDouble("1");
                } else {
                    Val1 = Val1 + Double.parseDouble(txtAnswer.getText().toString());
                    txtAnswer.setText(Val1.toString());
                    Sign = "+";
                    solveWithouEqu = true;
                }
            } catch (Exception ex) {
                txtAnswer.setText("0");
            }
            finally {}


        }});


        butsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View V) {
                try {
                    if (Val2 == 0.0) {
                        Val1 = Double.parseDouble(txtAnswer.getText().toString());
                        txtAnswer.setText("");
                        Sign = "-";
                        Val2 = Double.parseDouble("1");
                    } else {
                        Val1 = Val1 - Double.parseDouble(txtAnswer.getText().toString());
                        txtAnswer.setText(Val1.toString());
                        Sign = "-";
                        solveWithouEqu = true;
                    }
                } catch (Exception ex) {
                    txtAnswer.setText("0");
                }
                finally {}


            }});
        butmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View V) {
                try {
                    if (Val2 == 0.0) {
                        Val1 = Double.parseDouble(txtAnswer.getText().toString());
                        txtAnswer.setText("");
                        Sign = "*";
                        Val2 = Double.parseDouble("1");
                    } else {
                        Val1 = Val1 * Double.parseDouble(txtAnswer.getText().toString());
                        txtAnswer.setText(Val1.toString());
                        Sign = "*";
                        solveWithouEqu = true;
                    }
                } catch (Exception ex) {
                    txtAnswer.setText("0");
                }
                finally {}


            }});
        butdiv.setOnClickListener(new View.OnClickListener() {
           @Override
            public void onClick(View V) {
                try {
                    if (Val2 == 0.0) {
                        Val1 = Double.parseDouble(txtAnswer.getText().toString());
                        txtAnswer.setText("");
                        Sign = "/";
                        Val2 = Double.parseDouble("1");
                    } else {
                        Val1 = Val1 / Double.parseDouble(txtAnswer.getText().toString());
                        txtAnswer.setText(Val1.toString());
                        Sign = "/";
                        solveWithouEqu = true;
                    }
                } catch (Exception ex) {
                    txtAnswer.setText("0");
                }
                finally {}


            }});
        butc.setOnClickListener(new View.OnClickListener(){
        @Override
                 public void onClick(View V){

            txtAnswer.setText("");Val1=0.0;Val2=0.0;

        }});
        butce.setOnClickListener(new View.OnClickListener(){
        @Override
            public void onClick(View V) {

            try {
                int i = txtAnswer.getText().length();
                txtAnswer.setText(txtAnswer.getText().subSequence(0, i - 1));
                if (txtAnswer.getText() == null) {
                    Val1 = 0.0;
                }
            } catch (Exception ex) {
                txtAnswer.setText("");
            } finally {
            }

        }});

         butpow.setOnClickListener(new View.OnClickListener() {
         @Override
             public void onClick(View V){
             try{
                 if (Val2==0.0){
                     Val1=Double.parseDouble(txtAnswer.getText().toString());
                     txtAnswer.setText("");Sign="^";Val2=Double.parseDouble("1");
                 }else{
                     Val1 = Math.pow(Val1,Double.parseDouble(txtAnswer.getText().toString()));
                     txtAnswer.setText(Val1.toString());Sign="^";solveWithouEqu=true;
                 }} catch(Exception ex){txtAnswer.setText("0");}

                 finally {}


         }});

         butsqr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try{
                    Answer=Math.sqrt(Double.parseDouble(txtAnswer.getText().toString()));
                    Val2=0.0; Val1=0.0;
                    txtAnswer.setText(Answer.toString());solveWithouEqu=true;
                }
                catch (Exception ex) {txtAnswer.setText("0");}
                finally {

                }


            }});
        butdeg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try{
                    Answer=Math.toDegrees(Double.parseDouble(txtAnswer.getText().toString()));
                    Val2=0.0; Val1=0.0;
                    txtAnswer.setText(Answer.toString());solveWithouEqu=true;

                }
                catch (Exception ex) {txtAnswer.setText("0");}
                finally {

                }

            }
        });
        butcos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try{
                    Answer=Math.cos(Double.parseDouble(txtAnswer.getText().toString()));
                    Val2=0.0; Val1=0.0;
                    txtAnswer.setText(Answer.toString());solveWithouEqu=true;

                }
                catch (Exception ex) {txtAnswer.setText("0");}
                finally {

                }

            }
        });


        butsin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try{
                    Answer=Math.sin(Double.parseDouble(txtAnswer.getText().toString()));
                    Val2=0.0; Val1=0.0;
                    txtAnswer.setText(Answer.toString());solveWithouEqu=true;

                }
                catch (Exception ex) {txtAnswer.setText("0");}
                finally {

                }

            }
        });

        buttan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try{
                    Answer=Math.tan(Double.parseDouble(txtAnswer.getText().toString()));
                    Val2=0.0; Val1=0.0;
                    txtAnswer.setText(Answer.toString());solveWithouEqu=true;

                }
                catch (Exception ex) {txtAnswer.setText("0");}
                finally {

                }

            }
        });

        butrad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try{
                    Answer=Math.toRadians(Double.parseDouble(txtAnswer.getText().toString()));
                    Val2=0.0; Val1=0.0;
                    txtAnswer.setText(Answer.toString());solveWithouEqu=true;
                }
                catch (Exception ex) {txtAnswer.setText("0");}
                finally {

                }

            }
        });

        butlog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try{
                    Answer=Math.log(Double.parseDouble(txtAnswer.getText().toString()));
                    Val2=0.0; Val1=0.0;
                    txtAnswer.setText(Answer.toString());solveWithouEqu=true;
                }
                catch (Exception ex) {txtAnswer.setText("0");}
                finally {

                }



            }});



    butper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View V) {
                try {
                    if (Val2 == 0.0) {
                        Val1 = Double.parseDouble(txtAnswer.getText().toString());
                        txtAnswer.setText("");
                        Sign = "%";
                        Val2 = Double.parseDouble("1");
                    } else {
                        Val1 = Val1 * (Double.parseDouble(txtAnswer.getText().toString())/100 );
                        txtAnswer.setText(Val1.toString());
                        Sign = "%";
                        solveWithouEqu = true;
                    }
                } catch (Exception ex) {
                    txtAnswer.setText("0");
                }
                finally {}


            }});


        butequ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View V){
                try{

                    Val2=Double.parseDouble(txtAnswer.getText().toString());
                    switch (Sign){

                        case "+" :Answer=Val1 + Val2; break;
                        case "-" :Answer=Val1 - Val2; break;
                        case "*":Answer=Val1 * Val2; break;
                        case "/":Answer=Val1 / Val2; break;
                        case "%":Answer=Val1 * (Val2/100); break;
                        case "^":Answer=Math.pow(Val1,Val2); break;
                        default:
                    }
                      txtAnswer.setText(String.format(Answer.toString()));
                      Val2=0.0;Val1=0.0;solved=true;Sign="";
                } catch(Exception ex)
                {txtAnswer.setText("0");}

                finally {}


            }});
    }}


