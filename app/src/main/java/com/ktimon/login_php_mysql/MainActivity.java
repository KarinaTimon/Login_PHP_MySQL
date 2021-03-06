package com.ktimon.login_php_mysql;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
    
    EditText edtUsuario,edtPassword;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtUsuario=findViewById(R.id.edtUsuario);
        edtPassword=findViewById(R.id.edtPassword);
        btnLogin=findViewById(R.id.btnLogin);

        btnLogin,setOnClickListener(new View.OnClickListener() {
            @override
            public void onClick(View view) (
                    validarUsuario(URL:"http://192.168.1.1/developeru/validar_usuario.php");
            )
        });
    }
    
    private void validarUsuario(String URL) {
        StringRequest stringRequest=new StringRequest(Request.Method.POST,
                URL,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        if(!response.isEmpty())[
                        Intent intent=new Intent(getApplicationContext(),PrincipalActivity,class);
                        startActivity(intent);
                ]else{
                            Toast.makeText(MainActivity.this, text:"usuario o contraseña incorrecta", Toast.LENGTH_SHORT).show();
                        }

                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) (
                            Toast.makeText(context MainActivity.this error.tostring(), Toast.LENGTH_SHORT).show();
                    )
                }
        })[
                @Override
                protected Map<String, String> getParams()] throws AuthFailureError {
                    Map<String, String> parametros = new HashMap<String, String>();
                    parametros.put(k:"usuario", edtUsuario.getText().toString());
                    parametros.put(k:"password", edtPassword.getText().toString());
                    return parametros;
                }
        };

        RequestQueue requestQueue=Volley.newRequestQueue(context: this);
        requestQueue.add(stringRequest);
    }
}