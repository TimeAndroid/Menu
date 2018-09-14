package erikafelippe.com.find_pack_menu;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.hitomi.cmlibrary.CircleMenu;
import com.hitomi.cmlibrary.OnMenuSelectedListener;

public class MainActivity extends AppCompatActivity {

    String FindPack[] = {"Novo", "Enviados", "Pendentes", "Entregues"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CircleMenu circleMenu = (CircleMenu) findViewById(R.id.circlemenu);

        circleMenu.setMainMenu(Color.parseColor("#CDCDCD"),R.drawable.icon_menu, R.drawable.icon_menu)
        .addSubMenu(Color.parseColor("#C5E1A5"), R.drawable.icon_novo)
        .addSubMenu(Color.parseColor("#C5E1A5"), R.drawable.icon_enviados)
        .addSubMenu(Color.parseColor("#C5E1A5"), R.drawable.icon_pendentes)
        .addSubMenu(Color.parseColor("#C5E1A5"), R.drawable.icon_entregues)
        .setOnMenuSelectedListener(new OnMenuSelectedListener() {
            @Override
            public void onMenuSelected(int i) {
                Toast.makeText(MainActivity.this, "Rastreamento de encomendas : " +FindPack[i], Toast.LENGTH_LONG).show();

            }
        });


    }
}
