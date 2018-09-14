package erikafelippe.com.find_pack_menu;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.hitomi.cmlibrary.CircleMenu;
import com.hitomi.cmlibrary.OnMenuSelectedListener;

import java.util.Timer;
import java.util.TimerTask;

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

                        //                Toast.makeText(MainActivity.this, "Rastreamento de encomendas : " +FindPack[i], Toast.LENGTH_LONG).show();

                        try {


                            switch (i) {

                                case 0:
                                    new Timer().schedule(new TimerTask() {
                                        @Override
                                        public void run() {

                                            // this code will be executed after 2 seconds
                                            startActivity(new Intent(MainActivity.this, NovaEncomenda.class));

                                        }
                                    }, 1000);

                                    return;

                                case 1:

                                    new Timer().schedule(new TimerTask() {
                                        @Override
                                        public void run() {

                                            // this code will be executed after 2 seconds
                                            startActivity(new Intent(MainActivity.this, ItensEnviados.class));

                                        }
                                    }, 1000);

                                    return;

                                case 2:
                                    new Timer().schedule(new TimerTask() {
                                        @Override
                                        public void run() {

                                            // this code will be executed after 2 seconds
                                            startActivity(new Intent(MainActivity.this, ItensPendentes.class));

                                        }
                                    }, 1000);


                                    return;

                                case 3:
                                    new Timer().schedule(new TimerTask() {
                                        @Override
                                        public void run() {

                                            // this code will be executed after 2 seconds
                                            startActivity(new Intent(MainActivity.this, ItensEntregues.class));

                                        }
                                    }, 1000);


                                    return;

                            }

                        } catch (Exception e){

                            Log.e("Deu erro", e.getMessage());

                        }

                    }


                });

    }
}
