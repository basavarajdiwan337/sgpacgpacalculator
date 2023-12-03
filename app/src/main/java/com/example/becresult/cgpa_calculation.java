package com.example.becresult;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class cgpa_calculation extends AppCompatActivity {

    private EditText  editcredit, editcredit2, editcredit3, editcredit4, editcredit5, editcredit6, editcredit7, editcredit8, editcredit9, editcredit10, editcredit11, editcredit12, editcredit13, editcredit14, editcredit15, editgrd,editgrd2,editgrd3,editgrd4,editgrd5,editgrd6,editgrd7,editgrd8,editgrd9,editgrd10,editgrd11,editgrd12,editgrd13,editgrd14,editgrd15;
    private Button buttonresult;
    private TextView result;
    private double result1;
    TextView addCourse, resetCourseTV;
    ScrollView scroll;
    int addCourseBtnClickCount = 2;
    String no_sub;

    RelativeLayout s_Raw_3, s_Raw_4, s_Raw_5, s_Raw_6, s_Raw_7, s_Raw_8, s_Raw_9, s_Raw_10,
            s_Raw_11, s_Raw_12, s_Raw_13, s_Raw_14, s_Raw_15;
    boolean finish = false;
    boolean permission3, permission4, permission5, permission6, permission7, permission8, permission9, permission10,
            permission11, permission12, permission13, permission14, permission15 = false;

    private float ggr1,ggr2,ggr3,ggr4,ggr5,ggr6,ggr7,ggr8,ggr9,ggr10,ggr11,ggr12,ggr13,ggr14,ggr15;
    private double c, crd1, crd2, crd3, crd4, crd5, crd6, crd7, crd8, crd9, crd10, crd11, crd12, crd13, crd14, crd15;
    private float results1, results2, results3, results4, results5, results6, results7, results8, results9, results10, results11, results12, results13, results14, results15;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cgpa_calculation);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        ActionBar actionBar;
        actionBar = getSupportActionBar();
        ColorDrawable colorDrawable
                = new ColorDrawable(Color.parseColor("#D5143FBE"));
        actionBar.setBackgroundDrawable(colorDrawable);



        editcredit = (EditText) findViewById(R.id.edd1);
        editcredit2 = (EditText) findViewById(R.id.edd2);
        editcredit3 = (EditText) findViewById(R.id.edd3);
        editcredit4 = (EditText) findViewById(R.id.edd4);
        editcredit5 = (EditText) findViewById(R.id.edd5);
        editcredit6 = (EditText) findViewById(R.id.edd6);
        editcredit7 = (EditText) findViewById(R.id.edd7);
        editcredit8 = (EditText) findViewById(R.id.edd8);
        editcredit9 = (EditText) findViewById(R.id.edd9);
        editcredit10 = (EditText) findViewById(R.id.edd10);
        editcredit11 = (EditText) findViewById(R.id.edd11);
        editcredit12 = (EditText) findViewById(R.id.edd12);
        editcredit13 = (EditText) findViewById(R.id.edd13);
        editcredit14 = (EditText) findViewById(R.id.edd14);
        editcredit15 = (EditText) findViewById(R.id.edd15);

        editgrd   = (EditText) findViewById(R.id.gr1);
        editgrd2  = (EditText) findViewById(R.id.gr2);
        editgrd3  = (EditText) findViewById(R.id.gr3);
        editgrd4  = (EditText) findViewById(R.id.gr4);
        editgrd5  = (EditText) findViewById(R.id.gr5);
        editgrd6  = (EditText) findViewById(R.id.gr6);
        editgrd7  = (EditText) findViewById(R.id.gr7);
        editgrd8  = (EditText) findViewById(R.id.gr8);
        editgrd9  = (EditText) findViewById(R.id.gr9);
        editgrd10 = (EditText) findViewById(R.id.gr10);
        editgrd11 = (EditText) findViewById(R.id.gr11);
        editgrd12 = (EditText) findViewById(R.id.gr12);
        editgrd13 = (EditText) findViewById(R.id.gr13);
        editgrd14 = (EditText) findViewById(R.id.gr14);
        editgrd15 = (EditText) findViewById(R.id.gr15);


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


        buttonresult = (Button) findViewById(R.id.bt_calculate);
        result = (TextView) findViewById(R.id.tv_result);
        resetCourseTV = (TextView) findViewById(R.id.reset_course_TV);
        addCourse = (TextView) findViewById(R.id.add_course_TV);
        scroll = (ScrollView) findViewById(R.id.scroll_view);


        buttonresult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String creditValues1 = editcredit.getText().toString();
                if (creditValues1 != null && creditValues1.length() > 0) {
                    try {
                crd1 = Double.parseDouble(creditValues1);
                    }
                    catch (Exception e) {
                    }
                }

                String gradesValues1 = editgrd.getText().toString();
                if (gradesValues1 != null && gradesValues1.length() > 0) {
                    try {
                ggr1 = Float.parseFloat(gradesValues1);
                results1 = (float) (ggr1 * crd1);
                    }
                    catch (Exception e) {
                    }
                }

                String creditValues2 = editcredit2.getText().toString();
                if (creditValues2 != null && creditValues2.length() > 0) {
                    try {
                        crd2 = Double.parseDouble(creditValues2);
                    }
                    catch (Exception e) {
                    }
                }


                String gradesValues2 = editgrd2.getText().toString();
                if (gradesValues2 != null && gradesValues2.length() > 0) {
                    try {
                ggr2 = Float.parseFloat(gradesValues2);
                results2 = (float) (ggr2 * crd2);
                    }
                    catch (Exception e) {
                    }
                }

                String creditValues3 = editcredit3.getText().toString();
                if (creditValues3 != null && creditValues3.length() > 0) {
                    try {
                crd3 = Double.parseDouble(creditValues3);
                    }
                    catch (Exception e) {
                    }
                }


                String gradesValues3 = editgrd3.getText().toString();
                if (gradesValues3 != null && gradesValues3.length() > 0) {
                    try {
                ggr3 = Float.parseFloat(gradesValues3);
                results3 = (float) (ggr3 * crd3);
                    }
                    catch (Exception e) {
                    }
                }

                String creditValues4 = editcredit4.getText().toString();
                if (creditValues4 != null && creditValues4.length() > 0) {
                    try {
                crd4 = Double.parseDouble(creditValues4);
                    }
                    catch (Exception e) {
                    }
                }

                String gradesValues4 = editgrd4.getText().toString();
                        if (gradesValues4 != null && gradesValues4.length() > 0) {
                            try {
                ggr4 = Float.parseFloat(gradesValues4);
                results4 = (float) (ggr4 * crd4);
                            }
                            catch (Exception e) {
                            }
                        }


                String creditValues5 = editcredit5.getText().toString();
                if (creditValues5 != null && creditValues5.length() > 0) {
                    try {
                crd5 = Double.parseDouble(creditValues5);
            }
                    catch (Exception e) {
                                            }
                                        }

                String gradesValues5 = editgrd5.getText().toString();
                if (gradesValues5 != null && gradesValues5.length() > 0) {
                    try {
                ggr5 = Float.parseFloat(gradesValues5);
                results5 = (float) (ggr5 * crd5);
            }
                    catch (Exception e) {
                                            }
                                        }



                String creditValues6 = editcredit6.getText().toString();
                if (creditValues6 != null && creditValues6.length() > 0) {
                    try {
                crd6 = Double.parseDouble(creditValues6);
                    }
                    catch (Exception e) {
                    }
                }
                String gradesValues6 = editgrd6.getText().toString();
                if (gradesValues6 != null && gradesValues6.length() > 0) {
                    try {
                ggr6 = Float.parseFloat(gradesValues6);
                results6 = (float) (ggr6 * crd6 );
                    }
                    catch (Exception e) {
                    }
                }

                String creditValues7 = editcredit7.getText().toString();
                if (creditValues7 != null && creditValues7.length() > 0) {
                    try {
                crd7 = Double.parseDouble(creditValues7);
                    }
                    catch (Exception e) {
                    }
                }
                String gradesValues7 = editgrd7.getText().toString();
                if (gradesValues7 != null && gradesValues7.length() > 0) {
                    try {
                ggr7 = Float.parseFloat(gradesValues7);
                results7 = (float) (ggr7 * crd7 );
                    }
                    catch (Exception e) {
                    }
                }


                String creditValues8 = editcredit8.getText().toString();
                if (creditValues8 != null && creditValues8.length() > 0) {
                    try {
                crd8 = Double.parseDouble(creditValues8);
            }
                            catch (Exception e) {
                                            }
                                        }

                String gradesValues8 = editgrd8.getText().toString();
                if (gradesValues8 != null && gradesValues8.length() > 0) {
                    try {
                ggr8 = Float.parseFloat(gradesValues8);
                results8 = (float) (ggr8 * crd8 );
            }
                            catch (Exception e) {
                                            }
                                        }



                String creditValues9 = editcredit9.getText().toString();
                if (creditValues9 != null && creditValues9.length() > 0) {
                    try {
                crd9 = Double.parseDouble(creditValues9);
                    }
                    catch (Exception e) {
                    }
                }

                String gradesValues9 = editgrd9.getText().toString();
                if (gradesValues9 != null && gradesValues9.length() > 0) {
                    try {
                ggr9 = Float.parseFloat(gradesValues9);
                results9 = (float) (ggr9 * crd9 );
                    }
                    catch (Exception e) {
                    }
                }

                String creditValues10 = editcredit10.getText().toString();
                if (creditValues10 != null && creditValues10.length() > 0) {
                    try {
                crd10 = Double.parseDouble(creditValues10);
                    }
                    catch (Exception e) {
                    }
                }

                String gradesValues10 = editgrd10.getText().toString();
                if (gradesValues10 != null && gradesValues10.length() > 0) {
                    try {
                ggr10 = Float.parseFloat(gradesValues10);
                results10 = (float) (ggr10 * crd10 );
                    }
                    catch (Exception e) {
                    }
                }


                String creditValues11 = editcredit11.getText().toString();
                if (creditValues11 != null && creditValues11.length() > 0) {
                    try {
                crd11 = Double.parseDouble(creditValues11);
                    }
                    catch (Exception e) {
                    }
                }
                String gradesValues11 = editgrd11.getText().toString();
                if (gradesValues11 != null && gradesValues11.length() > 0) {
                    try {
                ggr11 = Float.parseFloat(gradesValues11);
                results11 = (float) (ggr11 * crd11 );
                    }
                    catch (Exception e) {
                    }
                }

                String creditValues12 = editcredit12.getText().toString();
                if (creditValues12 != null && creditValues12.length() > 0) {
                    try {
                crd12 = Double.parseDouble(creditValues12);
                    }
                    catch (Exception e) {
                    }
                }

                String gradesValues12 = editgrd12.getText().toString();
                if (gradesValues12 != null && gradesValues12.length() > 0) {
                    try {
                ggr12 = Float.parseFloat(gradesValues12);
                results12 = (float) (ggr12 * crd12 );
                    }
                    catch (Exception e) {
                    }
                }

                String creditValues13 = editcredit13.getText().toString();
                if (creditValues13 != null && creditValues13.length() > 0) {
                    try {
                crd13 = Double.parseDouble(creditValues13);
                    }
                    catch (Exception e) {
                    }
                }

                String gradesValues13 = editgrd13.getText().toString();
                if (gradesValues13 != null && gradesValues13.length() > 0) {
                    try {
                ggr13 = Float.parseFloat(gradesValues13);
                results13 = (float) (ggr13 * crd13 );
                    }
                    catch (Exception e) {
                    }
                }

                String creditValues14 = editcredit14.getText().toString();
                if (creditValues14 != null && creditValues14.length() > 0) {
                    try {
                crd14 = Double.parseDouble(creditValues14);
                    }
                    catch (Exception e) {
                    }
                }

                String gradesValues14 = editgrd14.getText().toString();
                if (gradesValues14 != null && gradesValues14.length() > 0) {
                    try {
                ggr14 = Float.parseFloat(gradesValues14);
                results14 = (float) (ggr14 * crd14 );
                    }
                    catch (Exception e) {
                    }
                }

                String creditValues15 = editcredit15.getText().toString();
                if (creditValues15 != null && creditValues15.length() > 0) {
                    try {
                crd15 = Double.parseDouble(creditValues15);
                    }
                    catch (Exception e) {
                    }
                }
                String gradesValues15 = editgrd15.getText().toString();
                if (gradesValues15 != null && gradesValues15.length() > 0) {
                    try {
                ggr15 = Float.parseFloat(gradesValues15);
                results15 = (float) (ggr15 * crd15 );
                    }
                    catch (Exception e) {
                    }
                }

                result1 = results1 + results2 + results3 + results4 + results5 + results6 + results7 + results8 + results9 + results10 + results11 + results12 + results13 + results14 + results15;

                c = crd1 + crd2 + crd3 + crd4 + crd5 + crd6 + crd7 + crd8 + crd9 + crd10 + crd11 + crd12 + crd13 + crd14 + crd15;

                float r = (float) (result1 / c);
                String totalCGPA = String.format("%.2f",r);

                result.setText(String.valueOf(totalCGPA));
            }
        });

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

        editgrd.setText("");
        editgrd2.setText("");
        editgrd3.setText("");
        editgrd4.setText("");
        editgrd5.setText("");
        editgrd6.setText("");
        editgrd7.setText("");
        editgrd8.setText("");
        editgrd9.setText("");
        editgrd10.setText("");
        editgrd11.setText("");
        editgrd12.setText("");
        editgrd13.setText("");
        editgrd14.setText("");
        editgrd15.setText("");
        result.setText("");

        addCourseBtnClickCount = 2;
    }
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
    public void onBackPressed() {
        super.onBackPressed();
        Intent intent = new Intent(cgpa_calculation.this,MainActivity.class);
        startActivity(intent);
        finish();
    }
}
