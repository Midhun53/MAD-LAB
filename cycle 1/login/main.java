public class MainActivity extends AppCompatActivity {
    private static final String VALID_USR_NAME = "user";
    private static final String VALID_PWD = "pass";
    private EditText username;
    private EditText password;
    Button loginbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username = findViewById(.uname);
        password = findViewById(.password);

        loginbtn = findViewById(R.id.lbtn);
        loginbtn.setOnClickListener(view -> {
            String enteredUname = username.getText().toString().trim();
            String enteredPwd = password.getText().toString().trim();
            if (enteredUname.isEmpty() || enteredPwd.isEmpty()) {
                showToast("Please enter both username and password");
            } else if (isValid(enteredUname, enteredPwd)) {
                showToast("Login Success");
            } else {
                showToast("Invalid credentials");
            }
        });
    }

    public boolean isValid(String euname, String epwd) {
        return VALID_USR_NAME.equals(euname) && VALID_PWD.equals(epwd);
    }
    private void showToast(String msg) {
        Toast.makeText(this, msg, Toast.LENGTH_LONG).show();
    }
}
