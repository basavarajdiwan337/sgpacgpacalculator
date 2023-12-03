package com.example.becresult;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class sgpa_calculation extends AppCompatActivity{
    TextView addCourse, resetCourseTV;
    ScrollView scroll;
    private String[] grade;
    private double result1;
    private EditText editcredit,editcredit2,editcredit3,editcredit4,editcredit5,editcredit6,editcredit7,editcredit8,editcredit9,editcredit10,editcredit11,editcredit12,editcredit13,editcredit14,editcredit15;
    private Spinner spinner,spinner2,spinner3,spinner4,spinner5,spinner6,spinner7,spinner8,spinner9,spinner10,spinner11,spinner12,spinner13,spinner14,spinner15;
    private Button buttonresult;
    private TextView result;
    int addCourseBtnClickCount = 2;
    RelativeLayout s_Raw_3, s_Raw_4, s_Raw_5, s_Raw_6, s_Raw_7, s_Raw_8, s_Raw_9, s_Raw_10,
            s_Raw_11, s_Raw_12, s_Raw_13, s_Raw_14, s_Raw_15;
    boolean finish = false;
    boolean permission3, permission4, permission5, permission6, permission7, permission8, permission9, permission10,
            permission11, permission12, permission13, permission14, permission15 = false;
    private float c,crd, crd1, crd2, crd3, crd4, crd5, crd6, crd7, crd8, crd9, crd10, crd11, crd12, crd13, crd14, crd15;
    private float results1, results2, results3, results4, results5, results6, results7, results8, results9, results10, results11, results12, results13, results14, results15;
    String no_sub;
    String selected_grd1, selected_grd2, selected_grd3, selected_grd4, selected_grd5, selected_grd6, selected_grd7, selected_grd8, selected_grd9, selected_grd10, selected_grd11, selected_grd12, selected_grd13, selected_grd14, selected_grd15;
    @SuppressLint("RestrictedApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sgpa_calculation);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ActionBar actionBar;
        actionBar = getSupportActionBar();
        ColorDrawable colorDrawable
                = new ColorDrawable(Color.parseColor("#D5143FBE"));
        actionBar.setBackgroundDrawable(colorDrawable);

        editcredit = (EditText) findViewById(R.id.edd1);
        spinner = (Spinner) findViewById(R.id.sp1);
        editcredit2 = (EditText) findViewById(R.id.edd2);
        spinner2 = (Spinner) findViewById(R.id.sp2);
        editcredit3 = (EditText) findViewById(R.id.edd3);
        spinner3 = (Spinner) findViewById(R.id.sp3);
        editcredit4 = (EditText) findViewById(R.id.edd4);
        spinner4 = (Spinner) findViewById(R.id.sp4);
        editcredit5 = (EditText) findViewById(R.id.edd5);
        spinner5 = (Spinner) findViewById(R.id.sp5);
        editcredit6 = (EditText) findViewById(R.id.edd6);
        spinner6 = (Spinner) findViewById(R.id.sp6);
        editcredit7 = (EditText) findViewById(R.id.edd7);
        spinner7 = (Spinner) findViewById(R.id.sp7);
        editcredit8 = (EditText) findViewById(R.id.edd8);
        spinner8 = (Spinner) findViewById(R.id.sp8);
        editcredit9 = (EditText) findViewById(R.id.edd9);
        spinner9 = (Spinner) findViewById(R.id.sp9);
        editcredit10 = (EditText) findViewById(R.id.edd10);
        spinner10 = (Spinner) findViewById(R.id.sp10);
        editcredit11 = (EditText) findViewById(R.id.edd11);
        spinner11 = (Spinner) findViewById(R.id.sp11);
        editcredit12 = (EditText) findViewById(R.id.edd12);
        spinner12 = (Spinner) findViewById(R.id.sp12);
        editcredit13 = (EditText) findViewById(R.id.edd13);
        spinner13 = (Spinner) findViewById(R.id.sp13);
        editcredit14 = (EditText) findViewById(R.id.edd14);
        spinner14 = (Spinner) findViewById(R.id.sp14);
        editcredit15 = (EditText) findViewById(R.id.edd15);
        spinner15 = (Spinner) findViewById(R.id.sp15);

        buttonresult = (Button) findViewById(R.id.bt_calculate);
        result = (TextView) findViewById(R.id.tv_result);
        resetCourseTV = (TextView) findViewById(R.id.reset_course_TV);
        addCourse = (TextView) findViewById(R.id.add_course_TV);
        scroll = (ScrollView) findViewById(R.id.scroll_view);

        s_Raw_3 = findViewById(R.id.s_row_3);
        s_Raw_4 = findViewById(R.id.s_row_4);
        s_Raw_5 = findViewById(R.id.s_row_5);
        s_Raw_6 = findViewById(R.id.s_row_6);
        s_Raw_7 = findViewById(R.id.s_row_7);
        s_Raw_8 = findViewById(R.id.s_row_8);
        s_Raw_9 = findViewById(R.id.s_row_9);
        s_Raw_10 = findViewById(R.id.s_row_10);
        s_Raw_11 = findViewById(R.id.s_row_11);
        s_Raw_12 = findViewById(R.id.s_row_12);
        s_Raw_13 = findViewById(R.id.s_row_13);
        s_Raw_14= findViewById(R.id.s_row_14);
        s_Raw_15= findViewById(R.id.s_row_15);

        final String[] grades = {"S", "A", "B", "C", "D", "E", "F" , "W" , "PP" , "NP" , "X" , "select"};

        Intent intent = getIntent();
        Bundle gp = intent.getExtras();
        if (gp != null) {
            no_sub = (String) gp.get("sub_no");
        }

        Resources res = getResources();
        grade = res.getStringArray(R.array.Grade);
        //selecting spinner
        Spinner gr = (Spinner) findViewById(R.id.sp1);
        gr.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                selected_grd1 = parent.getItemAtPosition(position).toString();

                try {
                    String gradesValues = editcredit.getText().toString();
                    crd1 = Float.parseFloat(gradesValues);

                    float gradesValue1 = checkgrade(selected_grd1);
                    results1 = (float) (gradesValue1 * crd1);
                } catch (NumberFormatException e) {
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        ArrayAdapter a = new ArrayAdapter(this, android.R.layout.simple_spinner_item, grade);
        a.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        gr.setAdapter(a);

        Spinner gr2 = (Spinner) findViewById(R.id.sp2);
        gr2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                selected_grd2 = parent.getItemAtPosition(position).toString();
                try {
                    String gradesValues = editcredit2.getText().toString();
                    crd2 = Float.parseFloat(gradesValues);
                    float gradesValue2 = checkgrade(selected_grd2);
                    results2 = (float) (gradesValue2 * crd2);
                } catch (NumberFormatException e) {
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
        ArrayAdapter a2 = new ArrayAdapter(this, android.R.layout.simple_spinner_item, grade);
        a2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        gr2.setAdapter(a2);

        Spinner gr3 = (Spinner) findViewById(R.id.sp3);
        gr3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                selected_grd3 = parent.getItemAtPosition(position).toString();
                try {
                    String gradesValues = editcredit3.getText().toString();
                    crd3 = Float.parseFloat(gradesValues);
                    float gradesValue3 = checkgrade(selected_grd3);
                    results3 = (float) (gradesValue3 * crd3);
                } catch (NumberFormatException e) {
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
        ArrayAdapter a3 = new ArrayAdapter(this, android.R.layout.simple_spinner_item, grade);
        a3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        gr3.setAdapter(a3);

        Spinner gr4 = (Spinner) findViewById(R.id.sp4);
        gr4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                selected_grd4 = parent.getItemAtPosition(position).toString();
                try {
                    String gradesValues = editcredit4.getText().toString();
                    crd4 = Float.parseFloat(gradesValues);
                    float gradesValue4 = checkgrade(selected_grd4);
                    results4 = (float) (gradesValue4 * crd4);
                } catch (NumberFormatException e) {
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
        ArrayAdapter a4 = new ArrayAdapter(this, android.R.layout.simple_spinner_item, grade);
        a4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        gr4.setAdapter(a4);

        Spinner gr5 = (Spinner) findViewById(R.id.sp5);
        gr5.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                selected_grd5 = parent.getItemAtPosition(position).toString();
                try {
                    String gradesValues = editcredit5.getText().toString();
                    crd5 = Float.parseFloat(gradesValues);
                    float gradesValue5 = checkgrade(selected_grd5);
                    results5 = (float) (gradesValue5 * crd5);
                } catch (NumberFormatException e) {
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
        ArrayAdapter a5 = new ArrayAdapter(this, android.R.layout.simple_spinner_item, grade);
        a5.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        gr5.setAdapter(a5);

        Spinner gr6 = (Spinner) findViewById(R.id.sp6);
        gr6.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                selected_grd6 = parent.getItemAtPosition(position).toString();

                try {
                    String gradesValues = editcredit6.getText().toString();
                    crd6 = Float.parseFloat(gradesValues);
                    float gradesValue6 = checkgrade(selected_grd6);
                    results6 = (float) (gradesValue6 * crd6);
                } catch (NumberFormatException e) {
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
        ArrayAdapter a6 = new ArrayAdapter(this, android.R.layout.simple_spinner_item, grade);
        a6.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        gr6.setAdapter(a6);

        Spinner gr7 = (Spinner) findViewById(R.id.sp7);
        gr7.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                selected_grd7 = parent.getItemAtPosition(position).toString();
                try {
                    String gradesValues = editcredit7.getText().toString();
                    crd7 = Float.parseFloat(gradesValues);
                    float gradesValue7 = checkgrade(selected_grd7);
                    results7 = (float) (gradesValue7 * crd7);
                } catch (NumberFormatException e) {
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
        ArrayAdapter a7 = new ArrayAdapter(this, android.R.layout.simple_spinner_item, grade);
        a7.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        gr7.setAdapter(a7);

        Spinner gr8 = (Spinner) findViewById(R.id.sp8);
        gr8.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                selected_grd8 = parent.getItemAtPosition(position).toString();
                try {
                    String gradesValues = editcredit8.getText().toString();
                    crd8 = Float.parseFloat(gradesValues);
                    float gradesValue8 = checkgrade(selected_grd8);
                    results8 = (float) (gradesValue8 * crd8);
                } catch (NumberFormatException e) {
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
        ArrayAdapter a8 = new ArrayAdapter(this, android.R.layout.simple_spinner_item, grade);
        a8.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        gr8.setAdapter(a8);

        Spinner gr9 = (Spinner) findViewById(R.id.sp9);
        gr9.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                selected_grd9 = parent.getItemAtPosition(position).toString();
                try {
                    String gradesValues = editcredit9.getText().toString();
                    crd9 = Float.parseFloat(gradesValues);
                    float gradesValue9 = checkgrade(selected_grd9);
                    results9 = (float) (gradesValue9 * crd9);
                } catch (NumberFormatException e) {
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
        ArrayAdapter a9 = new ArrayAdapter(this, android.R.layout.simple_spinner_item, grade);
        a9.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        gr9.setAdapter(a9);

        Spinner gr10 = (Spinner) findViewById(R.id.sp10);
        gr10.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                selected_grd10 = parent.getItemAtPosition(position).toString();
                try {
                    String gradesValues = editcredit10.getText().toString();
                    crd10 = Float.parseFloat(gradesValues);
                    float gradesValue10 = checkgrade(selected_grd10);
                    results10 = (float) (gradesValue10 * crd10);
                } catch (NumberFormatException e) {
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
        ArrayAdapter a10 = new ArrayAdapter(this, android.R.layout.simple_spinner_item, grade);
        a10.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        gr10.setAdapter(a10);

        Spinner gr11 = (Spinner) findViewById(R.id.sp11);
        gr11.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                selected_grd11 = parent.getItemAtPosition(position).toString();
                try {
                    String gradesValues = editcredit11.getText().toString();
                    crd11 = Float.parseFloat(gradesValues);
                    float gradesValue11 = checkgrade(selected_grd11);
                    results11 = (float) (gradesValue11 * crd11);
                } catch (Exception e) {
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
        ArrayAdapter a11 = new ArrayAdapter(this, android.R.layout.simple_spinner_item, grade);
        a11.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        gr11.setAdapter(a11);

        Spinner gr12 = (Spinner) findViewById(R.id.sp12);
        gr12.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                selected_grd12 = parent.getItemAtPosition(position).toString();
                try {
                    String gradesValues = editcredit12.getText().toString();
                    crd12 = Float.parseFloat(gradesValues);
                    float gradesValue12 = checkgrade(selected_grd12);
                    results12 = (float) (gradesValue12 * crd12);
                } catch (Exception e) {
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
        ArrayAdapter a12 = new ArrayAdapter(this, android.R.layout.simple_spinner_item, grade);
        a12.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        gr12.setAdapter(a12);

        Spinner gr13 = (Spinner) findViewById(R.id.sp13);
        gr13.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                selected_grd13 = parent.getItemAtPosition(position).toString();
                try {
                    String gradesValues = editcredit13.getText().toString();
                    crd13 = Float.parseFloat(gradesValues);
                    float gradesValue13 = checkgrade(selected_grd13);
                    results13 = (float) (gradesValue13 * crd13);
                } catch (Exception e) {
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
        ArrayAdapter a13 = new ArrayAdapter(this, android.R.layout.simple_spinner_item, grade);
        a13.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        gr13.setAdapter(a13);

        Spinner gr14 = (Spinner) findViewById(R.id.sp14);
        gr14.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                selected_grd14 = parent.getItemAtPosition(position).toString();
                try {
                    String gradesValues = editcredit14.getText().toString();
                    crd14 = Float.parseFloat(gradesValues);
                    float gradesValue14 = checkgrade(selected_grd14);
                    results14 = (float) (gradesValue14 * crd14);
                } catch (Exception e) {
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
        ArrayAdapter a14 = new ArrayAdapter(this, android.R.layout.simple_spinner_item, grade);
        a14.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        gr14.setAdapter(a14);

        Spinner gr15 = (Spinner) findViewById(R.id.sp15);
        gr15.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                selected_grd15 = parent.getItemAtPosition(position).toString();
                try {
                    String gradesValues = editcredit15.getText().toString();
                    crd15 = Float.parseFloat(gradesValues);
                    float gradesValue15 = checkgrade(selected_grd15);
                    results15 = (float) (gradesValue15 * crd15);
                } catch (Exception e) {
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
        ArrayAdapter a15 = new ArrayAdapter(this, android.R.layout.simple_spinner_item, grade);
        a15.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        gr15.setAdapter(a15);

        resetCourseTV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                resetAll();
            }
        });
        addCourse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                addNewCourse();

            }
        });
        buttonresult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                cal();

            }
        });
    }
    private void addNewCourse() {
            switch (++addCourseBtnClickCount) {
                case 3: {
                    s_Raw_3.setVisibility(RelativeLayout.VISIBLE);
                    s_Raw_3.requestFocus();
                    finish = false;
                    break;
                }
                case 4: {
                    s_Raw_4.setVisibility(RelativeLayout.VISIBLE);
                    s_Raw_4.requestFocus();
                    finish = false;
                    break;
                }
                case 5: {
                    s_Raw_5.setVisibility(RelativeLayout.VISIBLE);
                    s_Raw_5.requestFocus();
                    finish = false;
                    break;
                }
                case 6: {
                    s_Raw_6.setVisibility(RelativeLayout.VISIBLE);
                    s_Raw_6.requestFocus();
                    finish = false;
                    break;
                }
                case 7: {
                    s_Raw_7.setVisibility(RelativeLayout.VISIBLE);
                    addCourse.requestFocus();
                    finish = false;
                    break;
                }
                case 8: {
                    s_Raw_8.setVisibility(RelativeLayout.VISIBLE);
                    addCourse.requestFocus();
                    finish = false;
                    break;
                }
                case 9: {
                    s_Raw_9.setVisibility(RelativeLayout.VISIBLE);
                    addCourse.requestFocus();
                    scroll.fullScroll(View.FOCUS_DOWN);
                    finish = false;
                    break;
                }
                case 10: {
                    s_Raw_10.setVisibility(RelativeLayout.VISIBLE);
                    addCourse.requestFocus();
                    scroll.fullScroll(View.FOCUS_DOWN);
                    finish = false;
                    break;
                }
                case 11: {
                    s_Raw_11.setVisibility(LinearLayout.VISIBLE);
                    addCourse.requestFocus();
                    scroll.fullScroll(View.FOCUS_DOWN);
                    finish = false;
                    break;
                }
                case 12: {
                    s_Raw_12.setVisibility(LinearLayout.VISIBLE);
                    addCourse.requestFocus();
                    scroll.fullScroll(View.FOCUS_DOWN);
                    finish = false;
                    break;
                }
                case 13: {
                    s_Raw_13.setVisibility(LinearLayout.VISIBLE);
                    addCourse.requestFocus();
                    scroll.fullScroll(View.FOCUS_DOWN);
                    finish = false;
                    break;
                }
                case 14: {
                    s_Raw_14.setVisibility(LinearLayout.VISIBLE);
                    addCourse.requestFocus();
                    scroll.fullScroll(View.FOCUS_DOWN);
                    finish = false;
                    break;
                }
                case 15: {
                    s_Raw_15.setVisibility(LinearLayout.VISIBLE);
                    addCourse.requestFocus();
                    scroll.fullScroll(View.FOCUS_DOWN);
                    finish = false;
                    break;
                }
                default:{

                    Toast.makeText(this,  "Maximum number of Course has been added", Toast.LENGTH_SHORT).show();
                }
            }
        }
    private void resetAll() {
        s_Raw_3.setVisibility(RelativeLayout.GONE);
        s_Raw_4.setVisibility(RelativeLayout.GONE);
        s_Raw_5.setVisibility(RelativeLayout.GONE);
        s_Raw_6.setVisibility(RelativeLayout.GONE);
        s_Raw_7.setVisibility(RelativeLayout.GONE);
        s_Raw_8.setVisibility(RelativeLayout.GONE);
        s_Raw_9.setVisibility(RelativeLayout.GONE);
        s_Raw_10.setVisibility(RelativeLayout.GONE);
        s_Raw_11.setVisibility(RelativeLayout.GONE);
        s_Raw_12.setVisibility(RelativeLayout.GONE);
        s_Raw_13.setVisibility(RelativeLayout.GONE);
        s_Raw_14.setVisibility(RelativeLayout.GONE);
        s_Raw_15.setVisibility(RelativeLayout.GONE);
        finish = false;
        permission3 = false;
        permission4 = false;
        permission5 = false;
        permission6 = false;
        permission7 = false;
        permission8 = false;
        permission9 = false;
        permission10 = false;
        permission11 = false;
        permission12 = false;
        permission13 = false;
        permission14 = false;
        permission15 = false;

        editcredit.setText("");
        editcredit2.setText("");
        editcredit3.setText("");
        editcredit4.setText("");
        editcredit5.setText("");
        editcredit6.setText("");
        editcredit7.setText("");
        editcredit8.setText("");
        editcredit9.setText("");
        editcredit10.setText("");
        editcredit11.setText("");
        editcredit12.setText("");
        editcredit13.setText("");
        editcredit14.setText("");
        editcredit15.setText("");

        spinner.setSelection(0);
        spinner2.setSelection(0);
        spinner3.setSelection(0);
        spinner4.setSelection(0);
        spinner5.setSelection(0);
        spinner6.setSelection(0);
        spinner7.setSelection(0);
        spinner8.setSelection(0);
        spinner9.setSelection(0);
        spinner10.setSelection(0);
        spinner11.setSelection(0);
        spinner12.setSelection(0);
        spinner13.setSelection(0);
        spinner14.setSelection(0);
        spinner15.setSelection(0);

        result.setText("");
        addCourseBtnClickCount = 2;
    }
    private void cal() {
        result1 = results1 + results2 + results3 + results4 + results5 + results6 + results7 + results8 + results9 + results10 + results11 + results12 + results13 + results14 + results15;
         c = crd1 + crd2 + crd3 + crd4 + crd5 + crd6 + crd7 + crd8 + crd9 + crd10 + crd11 + crd12 + crd13 + crd14 + crd15;
        float r = (float) (result1 / c);
        String totalSGPA = String.format("%.2f",r);
        result.setText(String.valueOf(totalSGPA));
    }
    private float checkgrade(String selected_grd) {

        float value = 0;

        switch (selected_grd) {
            case "S":
                value = 10;
                break;
            case "A":
                value = 9;
                break;
            case "B":
                value = 8;
                break;
            case "C":
                value = 7;
                break;
            case "D":
                value = 5;
                break;
            case "E":
                value = 4;
                break;
            case "F":
                value = 0;
                break;
            case "W":
                value = 0.0f;
                break;
            case "PP":
                value = 0.0f;
                break;
            case "NP":
                value= 0.0f;
                break;
            case "X":
                value= 0;
                break;
            case "select":
                value= 0;
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + selected_grd);
        }
        return value;
    }
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
    public void onBackPressed() {
        super.onBackPressed();
        Intent intent = new Intent(sgpa_calculation.this,MainActivity.class);
        startActivity(intent);
        finish();
    }
}