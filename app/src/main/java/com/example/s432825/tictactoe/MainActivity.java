package com.example.s432825.tictactoe;

import android.support.v4.app.ServiceCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    public ArrayList<Button> TTTboard;
    int XWIN;
    int OWIN;
    int Move;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TTTboard = new ArrayList<Button>();
        TTTboard.add((Button) findViewById(R.id.TL));
        TTTboard.add((Button) findViewById(R.id.TM));
        TTTboard.add((Button) findViewById(R.id.TR));
        TTTboard.add((Button) findViewById(R.id.CL));
        TTTboard.add((Button) findViewById(R.id.CM));
        TTTboard.add((Button) findViewById(R.id.CR));
        TTTboard.add((Button) findViewById(R.id.BL));
        TTTboard.add((Button) findViewById(R.id.BM));
        TTTboard.add((Button) findViewById(R.id.BR));

    }

    //making our button clickable
    public void clickTR(View view) {
        TextView button = (TextView) (view);
        if (button.getText().equals("")) {
            button.setText("X");
            button.setTextSize(60);
            Move++;
            boolean xWin = checkWin("X");
            if (xWin) {
                XWIN++;
                TextView p = findViewById(R.id.PlayerScoreNum);
                p.setText(String.valueOf(XWIN));
                TTTboard.get(0).setText("");
                TTTboard.get(1).setText("");
                TTTboard.get(2).setText("");
                TTTboard.get(3).setText("");
                TTTboard.get(4).setText("");
                TTTboard.get(5).setText("");
                TTTboard.get(6).setText("");
                TTTboard.get(7).setText("");
                TTTboard.get(8).setText("");
                Move=0;
                Toast.makeText(this,"XWins",Toast.LENGTH_LONG).show();
            }
            else {

                if(Move<9) {
                    Random rand = new Random();
                    boolean success = false;
                    while (!success) {
                        if (TTTboard.get(0).getText().equals("O") && TTTboard.get(1).getText().equals("O") && TTTboard.get(2).getText().equals("")) {
                            TTTboard.get(2).setText("O");
                            success = true;
                            TTTboard.get(2).setTextSize(60);
                        } else if (TTTboard.get(0).getText().equals("O") && TTTboard.get(2).getText().equals("O") && TTTboard.get(2).getText().equals("")) {
                            TTTboard.get(1).setText("O");
                            success = true;
                            TTTboard.get(1).setTextSize(60);
                        } else if (TTTboard.get(1).getText().equals("O") && TTTboard.get(2).getText().equals("O") && TTTboard.get(0).getText().equals("")) {
                            TTTboard.get(0).setText("O");
                            success = true;
                            TTTboard.get(0).setTextSize(60);
                        } else if (TTTboard.get(0).getText().equals("O") && TTTboard.get(3).getText().equals("O") && TTTboard.get(6).getText().equals("")) {
                            TTTboard.get(6).setText("O");
                            success = true;
                            TTTboard.get(6).setTextSize(60);
                        } else if (TTTboard.get(0).getText().equals("O") && TTTboard.get(6).getText().equals("O") && TTTboard.get(3).getText().equals("")) {
                            TTTboard.get(3).setText("O");
                            success = true;
                            TTTboard.get(3).setTextSize(60);
                        } else if (TTTboard.get(6).getText().equals("O") && TTTboard.get(3).getText().equals("O") && TTTboard.get(0).getText().equals("")) {
                            TTTboard.get(0).setText("O");
                            success = true;
                            TTTboard.get(0).setTextSize(60);
                        } else if (TTTboard.get(3).getText().equals("O") && TTTboard.get(4).getText().equals("O") && TTTboard.get(5).getText().equals("")) {
                            TTTboard.get(5).setText("O");
                            success = true;
                            TTTboard.get(5).setTextSize(60);
                        } else if (TTTboard.get(3).getText().equals("O") && TTTboard.get(5).getText().equals("O") && TTTboard.get(4).getText().equals("")) {
                            TTTboard.get(4).setText("O");
                            success = true;
                            TTTboard.get(4).setTextSize(60);
                        } else if (TTTboard.get(4).getText().equals("O") && TTTboard.get(5).getText().equals("O") && TTTboard.get(3).getText().equals("")) {
                            TTTboard.get(3).setText("O");
                            success = true;
                            TTTboard.get(3).setTextSize(60);
                        } else if (TTTboard.get(6).getText().equals("O") && TTTboard.get(7).getText().equals("O") && TTTboard.get(8).getText().equals("")) {
                            TTTboard.get(8).setText("O");
                            success = true;
                            TTTboard.get(8).setTextSize(60);
                        } else if (TTTboard.get(6).getText().equals("O") && TTTboard.get(8).getText().equals("O") && TTTboard.get(7).getText().equals("")) {
                            TTTboard.get(7).setText("O");
                            success = true;
                            TTTboard.get(7).setTextSize(60);
                        } else if (TTTboard.get(7).getText().equals("O") && TTTboard.get(8).getText().equals("O") && TTTboard.get(6).getText().equals("")) {
                            TTTboard.get(6).setText("O");
                            success = true;
                            TTTboard.get(6).setTextSize(60);
                        } else if (TTTboard.get(1).getText().equals("O") && TTTboard.get(4).getText().equals("O") && TTTboard.get(7).getText().equals("")) {
                            TTTboard.get(7).setText("O");
                            success = true;
                            TTTboard.get(7).setTextSize(60);
                        } else if (TTTboard.get(1).getText().equals("O") && TTTboard.get(7).getText().equals("O") && TTTboard.get(4).getText().equals("")) {
                            TTTboard.get(4).setText("O");
                            success = true;
                            TTTboard.get(4).setTextSize(60);
                        } else if (TTTboard.get(4).getText().equals("O") && TTTboard.get(7).getText().equals("O") && TTTboard.get(1).getText().equals("")) {
                            TTTboard.get(1).setText("O");
                            success = true;
                            TTTboard.get(1).setTextSize(60);
                        } else if (TTTboard.get(2).getText().equals("O") && TTTboard.get(5).getText().equals("O") && TTTboard.get(8).getText().equals("")) {
                            TTTboard.get(8).setText("O");
                            success = true;
                            TTTboard.get(8).setTextSize(60);
                        } else if (TTTboard.get(2).getText().equals("O") && TTTboard.get(8).getText().equals("O") && TTTboard.get(5).getText().equals("")) {
                            TTTboard.get(5).setText("O");
                            success = true;
                            TTTboard.get(5).setTextSize(60);
                        } else if (TTTboard.get(8).getText().equals("O") && TTTboard.get(5).getText().equals("O") && TTTboard.get(2).getText().equals("")) {
                            TTTboard.get(2).setText("O");
                            success = true;
                            TTTboard.get(2).setTextSize(60);
                        } else if (TTTboard.get(2).getText().equals("O") && TTTboard.get(4).getText().equals("O") && TTTboard.get(6).getText().equals("")) {
                            TTTboard.get(6).setText("O");
                            success = true;
                            TTTboard.get(6).setTextSize(60);
                        } else if (TTTboard.get(2).getText().equals("O") && TTTboard.get(6).getText().equals("O") && TTTboard.get(4).getText().equals("")) {
                            TTTboard.get(4).setText("O");
                            success = true;
                            TTTboard.get(4).setTextSize(60);
                        } else if (TTTboard.get(6).getText().equals("O") && TTTboard.get(4).getText().equals("O") && TTTboard.get(2).getText().equals("")) {
                            TTTboard.get(2).setText("O");
                            success = true;
                            TTTboard.get(2).setTextSize(60);
                        } else if (TTTboard.get(0).getText().equals("O") && TTTboard.get(4).getText().equals("O") && TTTboard.get(8).getText().equals("")) {
                            TTTboard.get(8).setText("O");
                            success = true;
                            TTTboard.get(8).setTextSize(60);
                        } else if (TTTboard.get(0).getText().equals("O") && TTTboard.get(8).getText().equals("O") && TTTboard.get(4).getText().equals("")) {
                            TTTboard.get(4).setText("O");
                            success = true;
                            TTTboard.get(4).setTextSize(60);
                        } else if (TTTboard.get(4).getText().equals("O") && TTTboard.get(8).getText().equals("O") && TTTboard.get(0).getText().equals("")) {
                            TTTboard.get(0).setText("O");
                            success = true;
                            TTTboard.get(0).setTextSize(60);
                            //prevent the player from wining
                        } else if (TTTboard.get(0).getText().equals("X") && TTTboard.get(1).getText().equals("X") && TTTboard.get(2).getText().equals("")) {
                            TTTboard.get(2).setText("O");
                            success = true;
                            TTTboard.get(2).setTextSize(60);
                        } else if (TTTboard.get(0).getText().equals("X") && TTTboard.get(2).getText().equals("X") && TTTboard.get(1).getText().equals("")) {
                            TTTboard.get(1).setText("O");
                            success = true;
                            TTTboard.get(1).setTextSize(60);
                        } else if (TTTboard.get(1).getText().equals("X") && TTTboard.get(2).getText().equals("X") && TTTboard.get(0).getText().equals("")) {
                            TTTboard.get(0).setText("O");
                            success = true;
                            TTTboard.get(0).setTextSize(60);
                        } else if (TTTboard.get(3).getText().equals("X") && TTTboard.get(4).getText().equals("X") && TTTboard.get(5).getText().equals("")) {
                            TTTboard.get(5).setText("O");
                            success = true;
                            TTTboard.get(5).setTextSize(60);
                        } else if (TTTboard.get(3).getText().equals("X") && TTTboard.get(5).getText().equals("X") && TTTboard.get(4).getText().equals("")) {
                            TTTboard.get(4).setText("O");
                            success = true;
                            TTTboard.get(4).setTextSize(60);
                        } else if (TTTboard.get(3).getText().equals("X") && TTTboard.get(5).getText().equals("X") && TTTboard.get(4).getText().equals("")) {
                            TTTboard.get(4).setText("O");
                            success = true;
                            TTTboard.get(4).setTextSize(60);
                        } else if (TTTboard.get(4).getText().equals("X") && TTTboard.get(5).getText().equals("X") && TTTboard.get(3).getText().equals("")) {
                            TTTboard.get(3).setText("O");
                            success = true;
                            TTTboard.get(3).setTextSize(60);
                        } else if (TTTboard.get(6).getText().equals("X") && TTTboard.get(7).getText().equals("X") && TTTboard.get(8).getText().equals("")) {
                            TTTboard.get(8).setText("O");
                            success = true;
                            TTTboard.get(8).setTextSize(60);
                        } else if (TTTboard.get(6).getText().equals("X") && TTTboard.get(8).getText().equals("X") && TTTboard.get(7).getText().equals("")) {
                            TTTboard.get(7).setText("O");
                            success = true;
                            TTTboard.get(7).setTextSize(60);
                        } else if (TTTboard.get(7).getText().equals("X") && TTTboard.get(8).getText().equals("X") && TTTboard.get(6).getText().equals("")) {
                            TTTboard.get(6).setText("O");
                            success = true;
                            TTTboard.get(6).setTextSize(60);
                        } else if (TTTboard.get(0).getText().equals("X") && TTTboard.get(3).getText().equals("X") && TTTboard.get(6).getText().equals("")) {
                            TTTboard.get(6).setText("O");
                            success = true;
                            TTTboard.get(6).setTextSize(60);
                        } else if (TTTboard.get(0).getText().equals("X") && TTTboard.get(6).getText().equals("X") && TTTboard.get(3).getText().equals("")) {
                            TTTboard.get(3).setText("O");
                            success = true;
                            TTTboard.get(3).setTextSize(60);
                        } else if (TTTboard.get(0).getText().equals("X") && TTTboard.get(6).getText().equals("X") && TTTboard.get(3).getText().equals("")) {
                            TTTboard.get(3).setText("O");
                            success = true;
                            TTTboard.get(3).setTextSize(60);
                        } else if (TTTboard.get(3).getText().equals("X") && TTTboard.get(6).getText().equals("X") && TTTboard.get(0).getText().equals("")) {
                            TTTboard.get(0).setText("O");
                            success = true;
                            TTTboard.get(0).setTextSize(60);
                        } else if (TTTboard.get(1).getText().equals("X") && TTTboard.get(4).getText().equals("X") && TTTboard.get(7).getText().equals("")) {
                            TTTboard.get(7).setText("O");
                            success = true;
                            TTTboard.get(7).setTextSize(60);
                        } else if (TTTboard.get(1).getText().equals("X") && TTTboard.get(7).getText().equals("X") && TTTboard.get(4).getText().equals("")) {
                            TTTboard.get(4).setText("O");
                            success = true;
                            TTTboard.get(4).setTextSize(60);
                        } else if (TTTboard.get(4).getText().equals("X") && TTTboard.get(7).getText().equals("X") && TTTboard.get(1).getText().equals("")) {
                            TTTboard.get(1).setText("O");
                            success = true;
                            TTTboard.get(1).setTextSize(60);
                        } else if (TTTboard.get(2).getText().equals("X") && TTTboard.get(5).getText().equals("X") && TTTboard.get(8).getText().equals("")) {
                            TTTboard.get(8).setText("O");
                            success = true;
                            TTTboard.get(8).setTextSize(60);
                        } else if (TTTboard.get(2).getText().equals("X") && TTTboard.get(8).getText().equals("X") && TTTboard.get(5).getText().equals("")) {
                            TTTboard.get(5).setText("O");
                            success = true;
                            TTTboard.get(5).setTextSize(60);
                        } else if (TTTboard.get(5).getText().equals("X") && TTTboard.get(8).getText().equals("X") && TTTboard.get(2).getText().equals("")) {
                            TTTboard.get(2).setText("O");
                            success = true;
                            TTTboard.get(2).setTextSize(60);
                        } else if (TTTboard.get(0).getText().equals("X") && TTTboard.get(4).getText().equals("X") && TTTboard.get(8).getText().equals("")) {
                            TTTboard.get(8).setText("O");
                            success = true;
                            TTTboard.get(8).setTextSize(60);
                        } else if (TTTboard.get(0).getText().equals("X") && TTTboard.get(8).getText().equals("X") && TTTboard.get(4).getText().equals("")) {
                            TTTboard.get(4).setText("O");
                            success = true;
                            TTTboard.get(4).setTextSize(60);
                        } else if (TTTboard.get(8).getText().equals("X") && TTTboard.get(4).getText().equals("X") && TTTboard.get(0).getText().equals("")) {
                            TTTboard.get(0).setText("O");
                            success = true;
                            TTTboard.get(0).setTextSize(60);
                        } else if (TTTboard.get(2).getText().equals("X") && TTTboard.get(4).getText().equals("X") && TTTboard.get(6).getText().equals("")) {
                            TTTboard.get(6).setText("O");
                            success = true;
                            TTTboard.get(6).setTextSize(60);
                        } else if (TTTboard.get(2).getText().equals("X") && TTTboard.get(6).getText().equals("X") && TTTboard.get(4).getText().equals("")) {
                            TTTboard.get(4).setText("O");
                            success = true;
                            TTTboard.get(4).setTextSize(60);
                        } else if (TTTboard.get(6).getText().equals("X") && TTTboard.get(4).getText().equals("X") && TTTboard.get(2).getText().equals("")) {
                            TTTboard.get(2).setText("O");
                            success = true;
                            TTTboard.get(2).setTextSize(60);
                        } else if ((TTTboard.get(2).getText().equals("X") || TTTboard.get(0).getText().equals("X") || TTTboard.get(6).getText().equals("X") || TTTboard.get(8).getText().equals("X")) && (TTTboard.get(4).getText().equals(""))) {
                            TTTboard.get(4).setText("O");
                            success = true;
                            TTTboard.get(4).setTextSize(60);
                        } else {
                            int r = rand.nextInt(9);
                            if (TTTboard.get(r).getText().equals("")) {
                                TTTboard.get(r).setText("O");
                                success = true;
                                TTTboard.get(r).setTextSize(60);
                                if (TTTboard.get(0).getText().equals("X")) {


                                }


                            }
                        }
                    }
                    Move++;
                    boolean oWin = checkWin("O");
                    if (oWin) {
                        TextView q = findViewById(R.id.CPU);
                        OWIN++;
                        q.setText(String.valueOf(OWIN));
                        TTTboard.get(0).setText("");
                        TTTboard.get(1).setText("");
                        TTTboard.get(2).setText("");
                        TTTboard.get(3).setText("");
                        TTTboard.get(4).setText("");
                        TTTboard.get(5).setText("");
                        TTTboard.get(6).setText("");
                        TTTboard.get(7).setText("");
                        TTTboard.get(8).setText("");
                        Move=0;
                        Toast.makeText(this,"OWins",Toast.LENGTH_LONG).show();
                    }
                }else{
                    TTTboard.get(0).setText("");
                    TTTboard.get(1).setText("");
                    TTTboard.get(2).setText("");
                    TTTboard.get(3).setText("");
                    TTTboard.get(4).setText("");
                    TTTboard.get(5).setText("");
                    TTTboard.get(6).setText("");
                    TTTboard.get(7).setText("");
                    TTTboard.get(8).setText("");
                    Move=0;
                    Toast.makeText(this,"Tie",Toast.LENGTH_LONG).show();
                }
            }

        }

    }
    //[0,1,2]
    //[3,4,5]
    //[6,7,8]
    //[0,3,6]
    //[1,4,7]
    //[2,5,8]
    //[0,4,8]
    //[6,4,2]

    public boolean checkWin(String player) {
        if (TTTboard.get(0).getText().equals(player) && TTTboard.get(1).getText().equals(player) && TTTboard.get(2).getText().equals(player)) {
            return true;
        } else if (TTTboard.get(3).getText().equals(player) && TTTboard.get(4).getText().equals(player) && TTTboard.get(5).getText().equals(player)) {
            return true;
        } else if (TTTboard.get(6).getText().equals(player) && TTTboard.get(7).getText().equals(player) && TTTboard.get(8).getText().equals(player)) {
            return true;
        } else if (TTTboard.get(0).getText().equals(player) && TTTboard.get(3).getText().equals(player) && TTTboard.get(6).getText().equals(player)) {
            return true;
        } else if (TTTboard.get(1).getText().equals(player) && TTTboard.get(4).getText().equals(player) && TTTboard.get(7).getText().equals(player)) {
            return true;
        } else if (TTTboard.get(2).getText().equals(player) && TTTboard.get(5).getText().equals(player) && TTTboard.get(8).getText().equals(player)) {
            return true;
        } else if (TTTboard.get(0).getText().equals(player) && TTTboard.get(4).getText().equals(player) && TTTboard.get(8).getText().equals(player)) {
            return true;
        } else if (TTTboard.get(2).getText().equals(player) && TTTboard.get(4).getText().equals(player) && TTTboard.get(6).getText().equals(player)) {

            return true;
        }




        return false;
    }


    public void reset(View view) {

        TTTboard.get(0).setText("");
        TTTboard.get(1).setText("");
        TTTboard.get(2).setText("");
        TTTboard.get(3).setText("");
        TTTboard.get(4).setText("");
        TTTboard.get(5).setText("");
        TTTboard.get(6).setText("");
        TTTboard.get(7).setText("");
        TTTboard.get(8).setText("");
        ((TextView) (findViewById(R.id.CPU))).setText("");
        ((TextView) (findViewById(R.id.PlayerScoreNum))).setText("");
    }






}










