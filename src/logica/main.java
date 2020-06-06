package logica;

import datos.*;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

public class main {
    public static void main(String args[]){

        //Instancias elementos Curaci�n Estados
        CuracionEstados c1 = new CuracionEstados("Antihielo",8,"Medicina en espray que descongela a un Pok�mon.");
        CuracionEstados c2 = new CuracionEstados("Antiparalizador",200,"Medicina en espray que cura a un Pok�mon paralizado.");
        CuracionEstados c3 = new CuracionEstados("Antiquemar",40,"Medicina en espray que cura las quemaduras a un Pok�mon.");
        CuracionEstados c4 = new CuracionEstados("Ant�doto",20,"Medicina en espray que contrarresta los efectos del veneno en un Pok�mon.");
        CuracionEstados c5 = new CuracionEstados("Ant�-Covid19",100,"Te quita el covi");
        CuracionEstados c6 = new CuracionEstados("Galleta Lava",25,"Dulce t�pico de Pueblo Lavacalda que cura todos los problemas de estado de un Pok�mon.");
        CuracionEstados c7 = new CuracionEstados("Galleta Yantra",30,"Especialidad de Ciudad Yantra. Cura los problemas de estado de un Pok�mon.");
        CuracionEstados c8 = new CuracionEstados("Hierba Mental",67,"El Pok�mon que la lleva se libera del enamoramiento. Solo puede usarse una vez.");
        CuracionEstados c9 = new CuracionEstados("Polvo Curaci�n",44,"Polvos medicinales muy amargos que curan todos los problemas de estado de un Pok�mon.");
        CuracionEstados c10 = new CuracionEstados("Porcehelado",32,"Especialidad de Ciudad Porcelana. Cura los problemas de estado de un Pok�mon.");
        CuracionEstados c11 = new CuracionEstados("Refresco",15,"Chispeante bebida gaseosa que restaura 60 PS de un Pok�mon.");
        CuracionEstados c12 = new CuracionEstados("Restaurar Todo",100,"Medicina que restaura todos los PS y cura todos los problemas de estado de un Pok�mon.");
        HashMap<String, CuracionEstados> CuracionEstados = new HashMap<String, CuracionEstados>();
        CuracionEstados.put("Antihielo", c1); CuracionEstados.put("Antiparalizador", c2); CuracionEstados.put("Antiquemar", c3);
        CuracionEstados.put("Ant�doto",c4 ); CuracionEstados.put("Ant�-Covid19", c5 ); CuracionEstados.put("Galleta Lava", c6);
        CuracionEstados.put("Galleta Yantra", c7); CuracionEstados.put("Hierba Mental", c8 ); CuracionEstados.put("Polvo curaci�n", c9 );
        CuracionEstados.put("Porcehelado", c10 ); CuracionEstados.put("Refresco", c11 ); CuracionEstados.put("Restaurar Todo", c12 );


        //Instancias elementos Recuperar Vitalidad
        RecuperarVitalidad r1 = new RecuperarVitalidad("Poci�n",22,"Medicina en espray que cura heridas y restaura 20 PS a un Pok�mon.");
        RecuperarVitalidad r2 = new RecuperarVitalidad("Revivir", 19,"Medicina que revive a un Pok�mon debilitado y le devuelve la mitad de sus PS.");
        RecuperarVitalidad r3 = new RecuperarVitalidad("Superpoci�n",100,"Medicina en espray que cura heridas y restaura 50 PS de un Pok�mon.");
        RecuperarVitalidad r4 = new RecuperarVitalidad("Limonada",6,"Bebida muy dulce que restaura 80 PS de un Pok�mon.");
        RecuperarVitalidad r5 = new RecuperarVitalidad("Leche Mu-mu",12,"Leche de alto valor nutritivo que restaura 100 PS de un Pok�mon.");
        RecuperarVitalidad r6 = new RecuperarVitalidad("Caramelo Raro",99,"Caramelo energ�tico que sube a un Pok�mon de nivel.");
        RecuperarVitalidad r7 = new RecuperarVitalidad("Agua Fresca",2,"Agua de alto contenido mineral que restaura 50 PS de un Pok�mon.");
        RecuperarVitalidad r8 = new RecuperarVitalidad("Hiperpoci�n",101,"Medicina en espray que cura heridas y restaura 200 PS de un Pok�mon.");
        RecuperarVitalidad r9 = new RecuperarVitalidad("Ra�z Energ�a",105,"Ra�z muy amarga que restaura 200 PS de un Pok�mon.");
        HashMap<String, RecuperarVitalidad> RecuperarVitalidad = new HashMap<String, RecuperarVitalidad>();
        RecuperarVitalidad.put("Pocion", r1); RecuperarVitalidad.put("Revivir", r2 ); RecuperarVitalidad.put("Superpocion", r3);
        RecuperarVitalidad.put("Limonada", r4); RecuperarVitalidad.put("Leche Mu-mu", r5); RecuperarVitalidad.put("Caramelo Raro", r6);
        RecuperarVitalidad.put("Agua Fresca", r7); RecuperarVitalidad.put("Hiperpoci�n", r8); RecuperarVitalidad.put("Ra�z Energ�a", r9);

        //Instancias elementos Recuperar
        CambioPP p1 = new CambioPP("Elixir",10,"Restaura 10 PP de todos los movimientos aprendidos por el Pok�mon elegido.");
        CambioPP p2 = new CambioPP("Elixir Maximo", 20,"Restaura completamente los PP de todos los movimientos aprendidos por el Pok�mon elegido.");
        CambioPP p3 = new CambioPP("�ter",20,"Restaura 10 PP del movimiento elegido de un Pok�mon.");
        CambioPP p4 = new CambioPP("�ter Maximo",30,"Restaura completamente los PP del movimiento elegido de un Pok�mon.");
        CambioPP p5 = new CambioPP("M�s PP",38,"Aumenta ligeramente los PP m�ximos del movimiento elegido de un Pok�mon.");
        CambioPP p6 = new CambioPP("PP M�ximos",56,"Aumenta hasta el l�mite los PP m�ximos del movimiento elegido de un Pok�mon.");
        HashSet<CambioPP> CambioPP = new HashSet<CambioPP>();
        CambioPP.add(p1); CambioPP.add(p2); CambioPP.add(p3); CambioPP.add(p4); CambioPP.add(p5); CambioPP.add(p6);

        //Instancias Mejora de estad�sticas
        MejorarEstadisticas m1 = new MejorarEstadisticas("Ataque X",89,"Aumenta el Ataque en combate. Al intercambiar de Pok�mon, el efecto desaparece.");
        MejorarEstadisticas m2 = new MejorarEstadisticas("Calcio",44,"Nutritiva bebida que potencia el Ataque Especial de base de un Pok�mon.");
        MejorarEstadisticas m3 = new MejorarEstadisticas("Carburante",54,"Nutritiva bebida que potencia la Velocidad de base de un Pok�mon.");
        MejorarEstadisticas m4 = new MejorarEstadisticas("Defenza Espacial X",99,"Aumenta la Defensa Especial en combate. Al cambiar de Pok�mon, el efecto desaparece.");
        MejorarEstadisticas m5 = new MejorarEstadisticas("Defenza X",101,"Aumenta la Defensa en combate. Al cambiar de Pok�mon, el efecto desaparece.");
        MejorarEstadisticas m6 = new MejorarEstadisticas("Velocidad X",110,"Aumenta la Velocidad en combate. Al cambiar de Pok�mon, el efecto desaparece.");
        MejorarEstadisticas m7 = new MejorarEstadisticas("Precisi�n X",98,"Aumenta la Precisi�n de los ataques en combate. Al cambiar de Pok�mon, el efecto desaparece.");
        MejorarEstadisticas m8 = new MejorarEstadisticas("Pluma Mente",126,"Pluma que aumenta un poco la Defensa Especial de base de un Pok�mon.");
        MejorarEstadisticas m9 = new MejorarEstadisticas("Pluma M�sculo",99,"Pluma que aumenta un poco el Ataque de base de un Pok�mon.");
        MejorarEstadisticas m10 = new MejorarEstadisticas("Pluma Vigor",100,"Pluma que aumenta un poco los PS de base de un Pok�mon");
        MejorarEstadisticas m11 = new MejorarEstadisticas("Pluma Aguante",111,"Pluma que aumenta un poco la Defensa de base de un Pok�mon.");
        MejorarEstadisticas m12 = new MejorarEstadisticas("Pluma �mpetu",113,"Pluma que aumenta un poco la Velocidad de base de un Pok�mon.");
        MejorarEstadisticas m13 = new MejorarEstadisticas("Pluma Intelecto",140,"Pluma que aumenta un poco el Ataque Especial de base de un Pok�mon.");
        MejorarEstadisticas m14 = new MejorarEstadisticas("Hierro",50,"Nutritiva bebida que potencia la Defensa de base de un Pok�mon.");
        HashSet<MejorarEstadisticas> MejorarEstadisticas = new HashSet<MejorarEstadisticas>();
        MejorarEstadisticas.add(m1); MejorarEstadisticas.add(m2); MejorarEstadisticas.add(m3); MejorarEstadisticas.add(m4); MejorarEstadisticas.add(m5); MejorarEstadisticas.add(m6);
        MejorarEstadisticas.add(m7); MejorarEstadisticas.add(m8); MejorarEstadisticas.add(m9); MejorarEstadisticas.add(m10); MejorarEstadisticas.add(m11); MejorarEstadisticas.add(m12);
        MejorarEstadisticas.add(m13); MejorarEstadisticas.add(m14);

        //Instancias Bayas
        Bayas b1 = new Bayas("Baya Atania",12,"Los Pok�mon pueden llevarla o usarla para despertar del sue�o.");
        Bayas b2 = new Bayas("Baya Zreza",16,"Los Pok�mon pueden llevarla o usarla para recuperarse de los par�lisis");
        Bayas b3 = new Bayas("Baya Meloc",19,"Los Pok�mon pueden llevarla o usarla para curarse del envenenamiento.");
        Bayas b4 = new Bayas("Baya Aranja",5,"Los Pok�mon pueden llevarla o usarla para restaurar 10PS.");
        Bayas b5 = new Bayas("Baya Peragu",2,"Uno de los famosos ingredientes para preparar Pokochos, los dulces para Pok�mon de la regi�n de Sinnoh.");
        Bayas b6 = new Bayas("Baya Latano",3,"Uno de los famosos ingredientes para preparar Pokochos, los dulces para Pok�mon de la regi�n de Sinnoh.");
        Bayas b7 = new Bayas("Baya Perasi",10,"Los Pok�mon pueden levarla o usarla para descongelarse.");
        Bayas b8 = new Bayas("Baya Gualot",11,"Si la lleva un Pok�mon, debilita un ataque supereficaz de tipo El�ctrico de un enemigo.");
        TreeMap<String, Bayas> Bayas = new TreeMap<String, Bayas>();
        Bayas.put("Baya Atania",b1); Bayas.put("Baya Zreza", b2); Bayas.put("Baya Meloc", b3); Bayas.put("Baya Aranja", b4);
        Bayas.put("Baya Peragu", b5); Bayas.put("Baya Latano", b6); Bayas.put("Baya Perasi", b7); Bayas.put("Baya Gualot", b8);

        //Instancias Objetos Clave
        Obj_clave cl1 = new Obj_clave("Bici Acrob�tica",89,"Bici plegable ideal para saltar y hacer caballitos y giros.");
        Obj_clave cl2 = new Obj_clave("Super Ca�a",50,"Incre�ble ca�a de pescar de alta tecnolog�a. Pesca Pok�mon salvajes en todo tipo de aguas.");
        Obj_clave cl3 = new Obj_clave("Monedero",15,"Te servir� para llevar hasta 9999 fichas.");
        Obj_clave cl4 = new Obj_clave("Ca�a Buena",20,"Ca�a de pescar nuevecita y de gran calidad. Pesca Pok�mon salvajes en todo tipo de aguas.");
        Obj_clave cl5 = new Obj_clave("Busca Obejtos",31,"Detector de objetos invisibles por ondas sonoras.");
        Obj_clave cl6 = new Obj_clave("Cam�ra Lucha",38,"Un fant�stico dispositivo que graba combates entre amigos o celebrados en alg�n recinto especial.");
        Obj_clave cl7 = new Obj_clave("Planta Bayas",44,"Dispositivo port�til de cultivo que permite plantar Bayas en cualquier momento de forma sencilla.");
        Obj_clave cl8 = new Obj_clave("Regadera",10,"Objeto que contiene agua y se usa para regar las Bayas del Plantabayas.");
        TreeSet<Obj_clave> Obj_clave = new TreeSet<Obj_clave>();
        Obj_clave.add(cl1); Obj_clave.add(cl2); Obj_clave.add(cl3); Obj_clave.add(cl4);
        Obj_clave.add(cl5); Obj_clave.add(cl6); Obj_clave.add(cl7); Obj_clave.add(cl8);

        //Instancias PokeBalls
        PokeBall k1 = new PokeBall("Ultra Ball",20,"ok� Ball de rendimiento superior. Tiene un �ndice de �xito mayor al de la Super Ball.");
        PokeBall k2 = new PokeBall("Super Ball",9,"Pok� Ball de alto rendimiento. Tiene un �ndice de �xito superior al de la Pok� Ball.");
        PokeBall k3 = new PokeBall("Pok� Ball",5,"Dispositivo con dise�o capsular que atrapa Pok�mon salvajes. Se lanza como una bola contra el blanco.");
        PokeBall k4 = new PokeBall("M�ster Ball",11,"La Pok� Ball definitiva. Atrapa cualquier Pok�mon salvaje y no falla nunca.");
        PokeBall k5 = new PokeBall("Honor Ball",15,"Es una Pok� Ball algo singular que se cre� para conmemorar alg�n acontecimiento.");
        PokeBall k6 = new PokeBall("Lujo Ball",18,"Acogedora Pok� Ball que hace m�s amistosos a los Pok�mon salvajes capturados.");
        TreeMap<String, PokeBall> PokeBall = new TreeMap<String, PokeBall>();
        PokeBall.put("Ultra Ball", k1); PokeBall.put("Super Ball", k2); PokeBall.put("Pok� Ball", k3);
        PokeBall.put("M�ster Ball", k4); PokeBall.put("Honor Ball", k5);  PokeBall.put("Lujo Ball", k6);

        //Instancias Objetos
        Objetos o1 = new Objetos("Agua M�stica",67,"Gema con forma de gota de agua que fortalece los movimientos de tipo Agua. Debe lleverla un Pok�mon.");
        Objetos o2 = new Objetos("Diamansfera",18,"Una esfera brillante que potencia los movimientos de tipo Acero y Drag�n. Debe llevarla Dialga.");
        Objetos o3 = new Objetos("Gema Drag�n",22,"Joya de un solo uso que potencia los movimientos de tipo Drag�n. Debe llevarla un Pok�mon.");
        Objetos o4 = new Objetos("Huevo Suerte",15,"Es un huevo lleno de felicidad que te hace ganar Puntos de");
        Objetos o5 = new Objetos("Hierva Unica",10,"Permite el uso inmediato de cualquier movimiento en el primer turno. Es de un solo uso y debe llevarla un Pok�mon.");
        Objetos o6 = new Objetos("Lutresfera",12,"Una bonita esfera que potencia los movimientos de tipo Drag�n y Agua. Debe llevarla Palkia.");
        Objetos o7 = new Objetos("Pa�uelo Elegido",3,"Debe llevarlo un Pok�mon. Potencia la Velocidad, pero solo permite usar un movimiento.");
        Objetos o8 = new Objetos("Telescopio",80,"Debe llevarlo un Pok�mon. Si se mueve despu�s del enemigo, aumenta la Precisi�n del Pok�mon.");
        Objetos o9 = new Objetos("Roca Calor",77,"Prolonga la duraci�n del movimiento D�a Soleado que use el Pok�mon que la lleva.");
        Objetos o10 = new Objetos("Vidaesfera",76,"Potencia los movimientos, pero consume PS con cada ataque. Debe llevarla un Pok�mon.");
        TreeSet<Objetos> Objetos = new TreeSet<Objetos>();
        Objetos.add(o1); Objetos.add(o2); Objetos.add(o3); Objetos.add(o4); Objetos.add(o5);
        Objetos.add(o6); Objetos.add(o7); Objetos.add(o8); Objetos.add(o9); Objetos.add(o10);

        //Instancias evoluci�n
        Evolution e1 = new Evolution("Colmillo Agudo",20,"Si lo lleva un Pok�mon cuando inflige da�o a otro, puede hacer retroceder a este �ltimo.");
        Evolution e2 = new Evolution("Diente Marino",30,"Tiene el brillo afilado de la plata y debe llevarlo Clamperl. Sube el Ataque Especial.");
        Evolution e3 = new Evolution("Disco Extra�o",12,"Dispositivo transparente que contiene datos misteriosos. Es de fabricante desconocido.");
        Evolution e4 = new Evolution("Escama Marina",13,"Tiene un d�bil brillo rosado y debe llevarla Clamperl. Sube la Defensa Especial.");
        Evolution e5 = new Evolution("Piedra Alba",22,"Una piedra peculiar que hace evolucionar a algunos Pok�mon. Brilla como un lucero.");
        Evolution e6 = new Evolution("Piedra Solar",35,"Curiosa piedra que hace evolucionar a determinadas especies de Pok�mon. Es roja como el n�cleo del sol.");
        Evolution e7 = new Evolution("Protector",60,"Dispositivo de protecci�n muy pesado. Cierto Pok�mon lo adora.");
        Evolution e8 = new Evolution("Revestimiento Met�lico",86,"Pel�cula met�lica que fortalece los ataques de tipo Acero. Debe llevarlo un Pok�mon.");
        Evolution e9 = new Evolution("Magmatizador",19,"Esta caja contiene una enorme cantidad de energ�a magm�tica. Cierto Pok�mon lo adora.");
        Evolution e10 = new Evolution("Tela Terrible",100,"Tela imbuida de una energ�a espiritual muy potente. Cierto Pok�mon la adora.");
        HashMap<String, Evolution> Evolution = new HashMap<String, Evolution>();
        Evolution.put("Colmillo Agudo", e1); Evolution.put("Diente Marino", e2); Evolution.put("Disco Extra�o", e3); Evolution.put("Escama Marina", e4);
        Evolution.put("Piedra Alba", e5);  Evolution.put("Piedra Solar", e6); Evolution.put("Protector", e7); Evolution.put("Revestimiento Met�lico", e8);
        Evolution.put("Magmatizador", e9); Evolution.put("Tela Terrible", e10);


        int seleccion = main.leerNumero();
        switch(seleccion){
            case 1:
                //comprar
            case 2:
                System.out.println("Vuelve cuando quieras");
        }


    }
    public static int leerNumero(){
        Scanner lector = new Scanner(System.in);
        String entrada;
        while (true){
            System.out.println("Ingresa la opci�n");
            entrada = lector.nextLine();
            int valorAscii = (int)entrada.charAt(0);
            if ( 48 <= valorAscii  && valorAscii <= 52){
                return Integer.parseInt(entrada);
            }else{
                System.out.println("Entrada invalida, vuelve a intentarlo");
            }
        }
    }
}

