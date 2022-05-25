package com.example.test2_tatianapasechnik;

import androidx.appcompat.app.AppCompatActivity;

import android.widget.EditText;
import android.widget.TextView;
import android.os.Bundle;
import androidx.cardview.widget.CardView;
import android.content.Intent;
import android.view.View;
import android.widget.CheckBox;
public class MainTatianaActivity extends AppCompatActivity {

    TextView waterQty;
    TextView colaQty;
    String result;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_tatiana);
        waterQty=(TextView)findViewById(R.id.waterQunatity);
        colaQty=(TextView) findViewById(R.id.colaQty);

    }


    public void increaseWaterQuantity(View v) {
        String quantity = String.valueOf(waterQty.getText());
        int newQuantity = Integer.parseInt((quantity));
        newQuantity ++;
        waterQty.setText(Integer.toString(newQuantity));
    }

    public void increaseColaQuantity(View v) {
        String quantity = String.valueOf(colaQty.getText());
        int newQuantity = Integer.parseInt((quantity));
        newQuantity ++;
        colaQty.setText(Integer.toString(newQuantity));
    }

    public void decreaseWaterQuantity(View v) {
        String quantity = String.valueOf(waterQty.getText());
        int newQuantity = Integer.parseInt((quantity));
        if (newQuantity>0)
        {
            newQuantity--;
        } else{
            newQuantity=0;
        }
        waterQty.setText(Integer.toString(newQuantity));
    }
    public void decreaseColaQuantity(View v) {
        String quantity = String.valueOf(colaQty.getText());
        int newQuantity = Integer.parseInt((quantity));
        if (newQuantity>0)
        {
            newQuantity--;
        } else{
            newQuantity=0;
        }
        colaQty.setText(Integer.toString(newQuantity));
    }

    public void submitOrder (View v) {

      /*  String WaterQuantity = String.valueOf(waterQty.getText());
        int newWater = Integer.parseInt((WaterQuantity));

        String ColaQuantity = String.valueOf(waterQty.getText());
        int newCola = Integer.parseInt((WaterQuantity));

        CheckBox pizza=(CheckBox)findViewById(R.id.pizzaCheck);
        CheckBox burger=(CheckBox)findViewById(R.id.burgerCheck);
        if(pizza.isChecked())
        {
            result += "Pizza";
        }
        else if(burger.isChecked())
        {
            result += "Pizza";
        }

        CheckBox cola=(CheckBox)findViewById(R.id.cola);
        CheckBox water=(CheckBox)findViewById(R.id.water);

        if(cola.isChecked())
        {
            result+= "Cola";
        }

        if(water.isChecked())
        {
            result+= "Water";
        }


        Intent resultWindow = new Intent(MainTatianaActivity.this, ConfirmationTatianaActivity.class);
      resultWindow.putExtra("result",result);
        startActivity(resultWindow); */

        Intent resultActivity = new Intent(this,ConfirmationTatianaActivity.class);
        startActivity(resultActivity);



    }

}