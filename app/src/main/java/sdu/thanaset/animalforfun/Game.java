package sdu.thanaset.animalforfun;

import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.Collections;

public class Game extends AppCompatActivity {
    //Explicit
    Button btn1,btn2,btn3,btn4;
    ImageView questionImageView;
    MediaPlayer mediaPlayer;
    ImageButton volumnImageButton;
    int questionCount = 10; //กำหนดจำนวนข้อ
    ArrayList<Integer> qID = new ArrayList<Integer>();
    String answer ;                   //เก็บคำตอบที่เลือก
    int score =0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        //initial view
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        questionImageView = (ImageView) findViewById(R.id.imvQuestion);
        volumnImageButton = (ImageButton) findViewById(R.id.imbVolumn);
        for(int i=1; i<=questionCount; i++){
            qID.add(i);//จอง พท หน่วยความจำจำนวนข้อคำถาม

        }
        Collections.shuffle(qID);
        setQuestion(qID.remove(0));
    }//main class

    private void setQuestion(Integer qID) {
   if (qID == 1){
       answer = "นก";
       questionImageView.setImageResource(R.drawable.bird_02);
       mediaPlayer = mediaPlayer.create(this,R.raw.bird);

       ArrayList<String> choice =new ArrayList<String>();
       choice.add("นก");
       choice.add("สุนัข");
       choice.add("วัว");
       choice.add("หมู");

       Collections.shuffle(choice);
       btn1.setText(choice.remove(0));
       btn2.setText(choice.remove(0));
       btn3.setText(choice.remove(0));
       btn4.setText(choice.remove(0));
   }
        if (qID == 2){
            answer = "แมว";
            questionImageView.setImageResource(R.drawable.cat_02);
            mediaPlayer = mediaPlayer.create(this,R.raw.cat);

            ArrayList<String> choice =new ArrayList<String>();
            choice.add("แมว");
            choice.add("สุนัข");
            choice.add("วัว");
            choice.add("หมู");

            Collections.shuffle(choice);
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }
        if (qID == 3){
            answer = "วัว";
            questionImageView.setImageResource(R.drawable.cow_02);
            mediaPlayer = mediaPlayer.create(this,R.raw.cow);

            ArrayList<String> choice =new ArrayList<String>();
            choice.add("สิงโต");
            choice.add("สุนัข");
            choice.add("วัว");
            choice.add("หมู");

            Collections.shuffle(choice);
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }
        if (qID == 4){
            answer = "สุนัข";
            questionImageView.setImageResource(R.drawable.dog_02);
            mediaPlayer = mediaPlayer.create(this,R.raw.dog);

            ArrayList<String> choice =new ArrayList<String>();
            choice.add("นก");
            choice.add("สุนัข");
            choice.add("ม้า");
            choice.add("หมู");

            Collections.shuffle(choice);
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }
        if (qID == 5){
            answer = "ช้าง";
            questionImageView.setImageResource(R.drawable.elephant_02);
            mediaPlayer = mediaPlayer.create(this,R.raw.elephant);

            ArrayList<String> choice =new ArrayList<String>();
            choice.add("ช้าง");
            choice.add("สุนัข");
            choice.add("สิงโต");
            choice.add("หมู");

            Collections.shuffle(choice);
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }
        if (qID == 6){
            answer = "ม้า";
            questionImageView.setImageResource(R.drawable.horse_02);
            mediaPlayer = mediaPlayer.create(this,R.raw.horse);

            ArrayList<String> choice =new ArrayList<String>();
            choice.add("นก");
            choice.add("สุนัข");
            choice.add("วัว");
            choice.add("ม้า");

            Collections.shuffle(choice);
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }
        if (qID == 7){
            answer = "สิงโต";
            questionImageView.setImageResource(R.drawable.lion_02);
            mediaPlayer = mediaPlayer.create(this,R.raw.lion);

            ArrayList<String> choice =new ArrayList<String>();
            choice.add("ช้าง");
            choice.add("สิงโต");
            choice.add("วัว");
            choice.add("หมู");

            Collections.shuffle(choice);
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }
        if (qID == 8){
            answer = "ยุง";
            questionImageView.setImageResource(R.drawable.mosquito_02);
            mediaPlayer = mediaPlayer.create(this,R.raw.mosquito);

            ArrayList<String> choice =new ArrayList<String>();
            choice.add("นก");
            choice.add("สุนัข");
            choice.add("แมว");
            choice.add("ยุง");

            Collections.shuffle(choice);
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }
        if (qID == 9){
            answer = "หมู";
            questionImageView.setImageResource(R.drawable.pig_02);
            mediaPlayer = mediaPlayer.create(this,R.raw.pig);

            ArrayList<String> choice =new ArrayList<String>();
            choice.add("นก");
            choice.add("สุนัข");
            choice.add("วัว");
            choice.add("หมู");

            Collections.shuffle(choice);
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }
        if (qID == 10){
            answer = "แกะ";
            questionImageView.setImageResource(R.drawable.sheep_02);
            mediaPlayer = mediaPlayer.create(this,R.raw.sheep);

            ArrayList<String> choice =new ArrayList<String>();
            choice.add("นก");
            choice.add("สุนัข");
            choice.add("วัว");
            choice.add("แกะ");

            Collections.shuffle(choice);
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }

    }// End setQuestion method แสดงผลคำถามหน้าxml
    public void choiceAns(View view){
        Button button = (Button) view;
        String buttonString = button.getText().toString();
        if (buttonString.equals(answer)){
            score++;

        }
      if (qID.isEmpty()){ //ถ้าทำครบทุกข้อ
          dialogBoxScore();
      }  else {   //ถ้ายังไม่ครบ
          setQuestion(qID.remove(0));
      }
    }

    private void dialogBoxScore() {// method แสดงคะแนน
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("สรุปคะแนน");
        builder.setMessage("คุณได้คะแนน "+score +"คะแนน")
        .setCancelable(false)
        .setPositiveButton("ออกจากเกม", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish(); //ออกจากหน้า activity game
            }
        })
        .setNegativeButton("เล่นอีกครั้ง", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Intent intent = getIntent();
                finish();
                startActivity(intent);
            }
        });//end paramiter
        AlertDialog alertDialog = builder.create();
        alertDialog.show();



    } //end dialogBoxScore method

    public void playsound(View view){

        mediaPlayer.start();
    }
}//main class
