package com.example.aksha.subwayorderingsystem;

import android.content.Intent;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    RadioGroup mBreadsRadioGroup,mCheeseandToastedRadioGroup;
    RadioButton mRoastedGarlic,mItalian,mHoneyOats,mMultigrain,mToasted,mToastedWithCheese,
    mPlain,mPlainWithCheese;
    CheckBox mMayo,mMintMayo,mSouthWest,mMustard,mSweetOnion,mLettuce,mTomato,mOlives,mJalapenos,
    mCucumber,mPeppers,mOnions,mSaltPepper;
    Button mSubmit;
    LinearLayout mLinearLayout;
    ScrollView mScrollView;
    TextView mBreadChoice,mToastChoice,mSauceChoice,mAddOn,mVegetableChoice;
    String choice1="",choice2="";
    String vegetables="",sauces="",addonchoice="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBreadsRadioGroup=(RadioGroup)findViewById(R.id.breads);
        mCheeseandToastedRadioGroup=(RadioGroup)findViewById(R.id.cheeseAndToastedRadioGroup);
        mRoastedGarlic=(RadioButton)findViewById(R.id.roastedGarlic);
        mItalian=(RadioButton)findViewById(R.id.italian);
        mHoneyOats=(RadioButton)findViewById(R.id.honeyOats);
        mMultigrain=(RadioButton)findViewById(R.id.multigrain);
        mToasted=(RadioButton)findViewById(R.id.toasted);
        mToastedWithCheese=(RadioButton)findViewById(R.id.toastedWithCheese);
        mPlain=(RadioButton)findViewById(R.id.plain);
        mPlainWithCheese=(findViewById(R.id.plainWithCheese));
        mMayo=(CheckBox)findViewById(R.id.mayo);
        mMintMayo=(CheckBox)findViewById(R.id.mintMayo);
        mSouthWest=(CheckBox)findViewById(R.id.southwest);
        mSweetOnion=(CheckBox)findViewById(R.id.sweetOnion);
        mLettuce=(CheckBox)findViewById(R.id.lettuce);
        mTomato=(CheckBox)findViewById(R.id.tomato);
        mOlives=(CheckBox)findViewById(R.id.Olives);
        mJalapenos=(CheckBox)findViewById(R.id.jalapenos);
        mCucumber=(CheckBox)findViewById(R.id.cucumber);
        mPeppers=(CheckBox)findViewById(R.id.peppers);
        mOnions=(CheckBox)findViewById(R.id.onions);
        mSaltPepper=(CheckBox)findViewById(R.id.saltPepper);
        mSubmit=(Button)findViewById(R.id.submit);
        mLinearLayout=(LinearLayout)findViewById(R.id.linearLayout);
        mScrollView=(ScrollView)findViewById(R.id.scrollView);
        mBreadChoice=(TextView)findViewById(R.id.breadChoice);
        mSauceChoice=(TextView)findViewById(R.id.sauceChoice);
        mToastChoice=(TextView)findViewById(R.id.toastChoice);
        mAddOn=(TextView)findViewById(R.id.addOn);
        mVegetableChoice=(TextView)findViewById(R.id.vegetableChoice);






    }
    public void onClickBread(View view)
    {
        RadioButton rb=(RadioButton)view;
        choice1=rb.getText().toString();

    }
    public void onClickToast(View view)
    {
        RadioButton rb=(RadioButton)view;
        choice2=rb.getText().toString();
    }
    public void onClickSubmit(View view)
    {
        Intent intent=new Intent(MainActivity.this,DisplayActivity.class);
    intent.putExtra("mychoice1",choice1);
    intent.putExtra("mychoice2",choice2);
    intent.putExtra("mysauces",sauces);
    intent.putExtra("myvegetables",vegetables);
    intent.putExtra("myaddons",addonchoice);
        startActivity(intent);
    }


public void saucesCheckbox(View view)
{
    CheckBox cb=(CheckBox) view;
    sauces=sauces+cb.getText().toString()+"\n";
}
public void vegetablesCheckbox(View view)
{
    CheckBox cb=(CheckBox) view;
    vegetables=vegetables+cb.getText().toString()+"\n";
}
public void addCheckbox(View view)
{
    CheckBox cb=(CheckBox) view;
    addonchoice=addonchoice+cb.getText().toString()+"\n";
}
}
