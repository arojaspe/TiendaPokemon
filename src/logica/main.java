package logica;

import datos.*;

import java.io.ObjectStreamException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class main {
    public static void main(String args[]){
    	
    	//Instancias elementos Curaci�n Estados
    	HashMap<String, CuracionEstados> CuracionEstados = new HashMap<String, CuracionEstados>();
    	CuracionEstados.put("c1", new CuracionEstados("Antihielo",8,"Medicina en espray que descongela a un Pokemon."));
    	CuracionEstados.put("c2", new CuracionEstados("Antiparalizador",200,"Medicina en espray que cura a un Pokemon paralizado."));
    	CuracionEstados.put("c3", new CuracionEstados("Antiquemar",40,"Medicina en espray que cura las quemaduras a un Pokemon."));
    	CuracionEstados.put("c4", new CuracionEstados("Ant�doto",20,"Medicina en espray que contrarresta los efectos del veneno en un Pokemon."));
    	CuracionEstados.put("c5", new CuracionEstados("Anti-Covid19",100,"Te quita el covi y te hace inmune al 5G"));
    	CuracionEstados.put("c6", new CuracionEstados("Galleta Lava",25,"Dulce t�pico de Pueblo Lavacalda que cura todos los problemas de estado de un Pokemon."));
    	CuracionEstados.put("c7", new CuracionEstados("Galleta Yantra",30,"Especialidad de Ciudad Yantra. Cura los problemas de estado de un Pokemon."));
    	CuracionEstados.put("c8", new CuracionEstados("Hierba Mental",67,"El Pokemon que la lleva se libera del enamoramiento. Solo puede usarse una vez."));
    	CuracionEstados.put("c9", new CuracionEstados("Polvo Curaci�n",44,"Polvos medicinales muy amargos que curan todos los problemas de estado de un Pokemon."));
    	CuracionEstados.put("c10", new CuracionEstados("Porcehelado",32,"Especialidad de Ciudad Porcelana. Cura los problemas de estado de un Pokemon."));
    	CuracionEstados.put("c11", new CuracionEstados("Refresco",15,"Chispeante bebida gaseosa que restaura 60 PS de un Pokemon."));
    	CuracionEstados.put("c12", new CuracionEstados("Restaurar Todo",100,"Medicina que restaura todos los PS y cura todos los problemas de estado de un Pokemon."));


        //Instancias elementos Recuperar Vitalidad
    	HashMap<String, RecuperarVitalidad> RecuperarVitalidad = new HashMap<String, RecuperarVitalidad>();
        RecuperarVitalidad.put("r1", new RecuperarVitalidad("Poci�n",22,"Medicina en espray que cura heridas y restaura 20 PS a un Pokemon."));
        RecuperarVitalidad.put("r2", new RecuperarVitalidad("Revivir", 19,"Medicina que revive a un Pokemon debilitado y le devuelve la mitad de sus PS."));
        RecuperarVitalidad.put("r3", new RecuperarVitalidad("Superpoci�n",100,"Medicina en espray que cura heridas y restaura 50 PS de un Pokemon."));
        RecuperarVitalidad.put("r4", new RecuperarVitalidad("Limonada",6,"Bebida muy dulce que restaura 80 PS de un Pokemon."));
        RecuperarVitalidad.put("r5", new RecuperarVitalidad("Leche Mu-mu",12,"Leche de alto valor nutritivo que restaura 100 PS de un Pokemon."));
        RecuperarVitalidad.put("r6", new RecuperarVitalidad("Caramelo Raro",9990,"Caramelo energ�tico que sube a un Pokemon de nivel."));
        RecuperarVitalidad.put("r7", new RecuperarVitalidad("Agua Fresca",2,"Agua de alto contenido mineral que restaura 50 PS de un Pokemon."));
        RecuperarVitalidad.put("r8", new RecuperarVitalidad("Hiperpoci�n",101,"Medicina en espray que cura heridas y restaura 200 PS de un Pokemon."));
        RecuperarVitalidad.put("r9", new RecuperarVitalidad("Ra�z Energ�a",105,"Ra�z muy amarga que restaura 200 PS de un Pokemon."));

        //Instancias elementos Recuperar
        HashSet<CambioPP> CambioPP = new HashSet<CambioPP>();
        CambioPP.add(new CambioPP("Elixir",10,"Restaura 10 PP de todos los movimientos aprendidos por el Pokemon elegido."));
        CambioPP.add(new CambioPP("Elixir Maximo", 20,"Restaura completamente los PP de todos los movimientos aprendidos por el Pokemon elegido."));
        CambioPP.add(new CambioPP("�ter",20,"Restaura 10 PP del movimiento elegido de un Pokemon."));
        CambioPP.add(new CambioPP("�ter Maximo",30,"Restaura completamente los PP del movimiento elegido de un Pokemon."));
        CambioPP.add(new CambioPP("M�s PP",38,"Aumenta ligeramente los PP m�ximos del movimiento elegido de un Pokemon."));
        CambioPP.add(new CambioPP("PP M�ximos",56,"Aumenta hasta el l�mite los PP m�ximos del movimiento elegido de un Pokemon."));

       //Instancias Mejora de estad�sticas
        HashSet<MejorarEstadisticas> MejorarEstadisticas = new HashSet<MejorarEstadisticas>();
        MejorarEstadisticas.add(new MejorarEstadisticas("Ataque X",89,"Aumenta el Ataque en combate. Al intercambiar de Pokemon, el efecto desaparece."));
        MejorarEstadisticas.add(new MejorarEstadisticas("Calcio",44,"Nutritiva bebida que potencia el Ataque Especial de base de un Pokemon."));
        MejorarEstadisticas.add(new MejorarEstadisticas("Carburante",54,"Nutritiva bebida que potencia la Velocidad de base de un Pokemon."));
        MejorarEstadisticas.add(new MejorarEstadisticas("Defenza Espacial X",99,"Aumenta la Defensa Especial en combate. Al cambiar de Pokemon, el efecto desaparece."));
        MejorarEstadisticas.add(new MejorarEstadisticas("Defenza X",101,"Aumenta la Defensa en combate. Al cambiar de Pokemon, el efecto desaparece."));
        MejorarEstadisticas.add(new MejorarEstadisticas("Velocidad X",110,"Aumenta la Velocidad en combate. Al cambiar de Pokemon, el efecto desaparece."));
        MejorarEstadisticas.add(new MejorarEstadisticas("Precisi�n X",98,"Aumenta la Precisi�n de los ataques en combate. Al cambiar de Pokemon, el efecto desaparece."));
        MejorarEstadisticas.add(new MejorarEstadisticas("Pluma Mente",126,"Pluma que aumenta un poco la Defensa Especial de base de un Pokemon."));
        MejorarEstadisticas.add(new MejorarEstadisticas("Pluma M�sculo",99,"Pluma que aumenta un poco el Ataque de base de un Pokemon."));
        MejorarEstadisticas.add(new MejorarEstadisticas("Pluma Vigor",100,"Pluma que aumenta un poco los PS de base de un Pokemon"));
        MejorarEstadisticas.add(new MejorarEstadisticas("Pluma Aguante",111,"Pluma que aumenta un poco la Defensa de base de un Pokemon."));
        MejorarEstadisticas.add(new MejorarEstadisticas("Pluma �mpetu",113,"Pluma que aumenta un poco la Velocidad de base de un Pokemon."));
        MejorarEstadisticas.add(new MejorarEstadisticas("Pluma Intelecto",140,"Pluma que aumenta un poco el Ataque Especial de base de un Pokemon."));
        MejorarEstadisticas.add(new MejorarEstadisticas("Hierro",50,"Nutritiva bebida que potencia la Defensa de base de un Pokemon."));

        //Instancias Bayas
        TreeMap<String, Bayas> Bayas = new TreeMap<String, Bayas>();
        Bayas.put("b1", new Bayas("Baya Atania",12,"Los Pokemon pueden llevarla o usarla para despertar del sue�o."));
        Bayas.put("b2", new Bayas("Baya Zreza",16,"Los Pokemon pueden llevarla o usarla para recuperarse de los par�lisis"));
        Bayas.put("b3", new Bayas("Baya Meloc",19,"Los Pokemon pueden llevarla o usarla para curarse del envenenamiento."));
        Bayas.put("b4", new Bayas("Baya Aranja",5,"Los Pokemon pueden llevarla o usarla para restaurar 10PS."));
        Bayas.put("b5", new Bayas("Baya Peragu",2,"Uno de los famosos ingredientes para preparar Pokochos, los dulces para Pokemon de la regi�n de Sinnoh."));
        Bayas.put("b6", new Bayas("Baya Latano",3,"Uno de los famosos ingredientes para preparar Pokochos, los dulces para Pokemon de la regi�n de Sinnoh."));
        Bayas.put("b7", new Bayas("Baya Perasi",10,"Los Pokemon pueden levarla o usarla para descongelarse."));
        Bayas.put("b8", new Bayas("Baya Gualot",11,"Si la lleva un Pokemon, debilita un ataque supereficaz de tipo El�ctrico de un enemigo."));

        //Instancias Objetos Clave
        TreeSet<Obj_clave> Obj_clave = new TreeSet<Obj_clave>(); 
        Obj_clave.add(new Obj_clave("Bici Acrob�tica",89,"Bici plegable ideal para saltar y hacer caballitos y giros."));
        Obj_clave.add(new Obj_clave("Super Ca�a",50,"Incre�ble ca�aa de pescar de alta tecnolog�a. Pesca Pokemon salvajes en todo tipo de aguas."));
        Obj_clave.add(new Obj_clave("Monedero",15,"Te servir� para llevar hasta 9999 fichas."));
        Obj_clave.add(new Obj_clave("Ca�a Buena",20,"Ca�a de pescar nuevecita y de gran calidad. Pesca Pokemon salvajes en todo tipo de aguas."));
        Obj_clave.add(new Obj_clave("Busca Obejtos",31,"Detector de objetos invisibles por ondas sonoras."));
        Obj_clave.add(new Obj_clave("Cam�ra Lucha",38,"Un fant�stico dispositivo que graba combates entre amigos o celebrados en alg�n recinto especial."));
        Obj_clave.add(new Obj_clave("Planta Bayas",44,"Dispositivo port�til de cultivo que permite plantar Bayas en cualquier momento de forma sencilla."));
        Obj_clave.add(new Obj_clave("Regadera",10,"Objeto que contiene agua y se usa para regar las Bayas del Plantabayas."));

        //Instancias PokeBalls
        TreeMap<String, PokeBall> PokeBall = new TreeMap<String, PokeBall>();
        PokeBall.put("k1", new PokeBall("Pok� Ball",5,"Dispositivo con dise�o capsular que atrapa Pokemon salvajes. Se lanza como una bola contra el blanco."));
        PokeBall.put("k2", new PokeBall("Super Ball",9,"Pok� Ball de alto rendimiento. Tiene un �ndice de �xito superior al de la Pok� Ball."));
        PokeBall.put("k3", new PokeBall("Ultra Ball",20,"ok� Ball de rendimiento superior. Tiene un �ndice de �xito mayor al de la Super Ball."));
        PokeBall.put("k4", new PokeBall("Lujo Ball",18,"Acogedora Pok� Ball que hace m�s amistosos a los Pokemon salvajes capturados."));
        PokeBall.put("k5", new PokeBall("Honor Ball",15,"Es una Pok� Ball algo singular que se cre� para conmemorar alg�n acontecimiento."));
        PokeBall.put("k6", new PokeBall("M�ster Ball",2150,"La Pok� Ball definitiva. Atrapa cualquier Pokemon salvaje y no falla nunca."));

        //Instancias Objetos
        TreeSet<Objetos> Objetos = new TreeSet<Objetos>();
        Objetos.add(new Objetos("Agua M�stica",67,"Gema con forma de gota de agua que fortalece los movimientos de tipo Agua. Debe lleverla un Pokemon."));
        Objetos.add(new Objetos("Diamansfera",18,"Una esfera brillante que potencia los movimientos de tipo Acero y Drag�n. Debe llevarla Dialga."));
        Objetos.add(new Objetos("Gema Drag�n",22,"Joya de un solo uso que potencia los movimientos de tipo Drag�n. Debe llevarla un Pokemon."));
        Objetos.add(new Objetos("Huevo Suerte",15,"Es un huevo lleno de felicidad que te hace ganar Puntos de"));
        Objetos.add(new Objetos("Hierva Unica",10,"Permite el uso inmediato de cualquier movimiento en el primer turno. Es de un solo uso y debe llevarla un Pokemon."));
        Objetos.add(new Objetos("Lutresfera",12,"Una bonita esfera que potencia los movimientos de tipo Drag�n y Agua. Debe llevarla Palkia."));
        Objetos.add(new Objetos("Pa�uelo Elegido",3,"Debe llevarlo un Pokemon. Potencia la Velocidad, pero solo permite usar un movimiento."));
        Objetos.add(new Objetos("Telescopio",80,"Debe llevarlo un Pokemon. Si se mueve despu�s del enemigo, aumenta la Precisi�n del Pokemon."));
        Objetos.add(new Objetos("Roca Calor",77,"Prolonga la duraci�n del movimiento D�a Soleado que use el Pokemon que la lleva."));
        Objetos.add(new Objetos("Vidaesfera",76,"Potencia los movimientos, pero consume PS con cada ataque. Debe llevarla un Pokemon."));

        //Instancias evoluci�n
        HashMap<String, Evolution> Evolution = new HashMap<String, Evolution>();
        Evolution.put("e1", new Evolution("Colmillo Agudo",20,"Si lo lleva un Pokemon cuando inflige da�o a otro, puede hacer retroceder a este �ltimo."));
        Evolution.put("e2", new Evolution("Diente Marino",30,"Tiene el brillo afilado de la plata y debe llevarlo Clamperl. Sube el Ataque Especial."));
        Evolution.put("e3", new Evolution("Dizco Extra�o",12,"Dispositivo transparente que contiene datos misteriosos. Es de fabricante desconocido."));
        Evolution.put("e4", new Evolution("Escama Marina",13,"Tiene un d�bil brillo rosado y debe llevarla Clamperl. Sube la Defensa Especial."));
        Evolution.put("e5", new Evolution("Piedra Alba",22,"Una piedra peculiar que hace evolucionar a algunos Pokemon. Brilla como un lucero."));
        Evolution.put("e6", new Evolution("Piedra Solar",35,"Curiosa piedra que hace evolucionar a determinadas especies de Pokemon. Es roja como el n�cleo del sol."));
        Evolution.put("e7", new Evolution("Protector",60,"Dispositivo de protecci�n muy pesado. Cierto Pokemon lo adora."));
        Evolution.put("e8", new Evolution("Revestimiento M�talico",86,"Pel�cula met�lica que fortalece los ataques de tipo Acero. Debe llevarlo un Pokemon."));
        Evolution.put("e9", new Evolution("Magmatizador",19,"Esta caja contiene una enorme cantidad de energ�a magm�tica. Cierto Pokemon lo adora."));
        Evolution.put("e10", new Evolution("Tela Terrible",100,"Tela imbuida de una energ�a espiritual muy potente. Cierto Pokemon la adora."));




    }
}
