package logica;

import datos.*;

import java.io.ObjectStreamException;

public class main {
    public static void main(String args[]){

        //Instancias elementos Curación Estados
        CuracionEstados c1 = new CuracionEstados("Antihielo",8,"Medicina en espray que descongela a un Pokémon.");
        CuracionEstados c2 = new CuracionEstados("Antiparalizador",200,"Medicina en espray que cura a un Pokémon paralizado.");
        CuracionEstados c3 = new CuracionEstados("Antiquemar",40,"Medicina en espray que cura las quemaduras a un Pokémon.");
        CuracionEstados c4 = new CuracionEstados("Antídoto",20,"Medicina en espray que contrarresta los efectos del veneno en un Pokémon.");
        CuracionEstados c5 = new CuracionEstados("Antí-Covid19",100,"Te quita el covi");
        CuracionEstados c6 = new CuracionEstados("Galleta Lava",25,"Dulce típico de Pueblo Lavacalda que cura todos los problemas de estado de un Pokémon.");
        CuracionEstados c7 = new CuracionEstados("Galleta Yantra",30,"Especialidad de Ciudad Yantra. Cura los problemas de estado de un Pokémon.");
        CuracionEstados c8 = new CuracionEstados("Hierba Mental",67,"El Pokémon que la lleva se libera del enamoramiento. Solo puede usarse una vez.");
        CuracionEstados c9 = new CuracionEstados("Polvo Curación",44,"Polvos medicinales muy amargos que curan todos los problemas de estado de un Pokémon.");
        CuracionEstados c10 = new CuracionEstados("Porcehelado",32,"Especialidad de Ciudad Porcelana. Cura los problemas de estado de un Pokémon.");
        CuracionEstados c11 = new CuracionEstados("Refrezco",15,"Chispeante bebida gaseosa que restaura 60 PS de un Pokémon.");
        CuracionEstados c12 = new CuracionEstados("Restaurar Todo",100,"Medicina que restaura todos los PS y cura todos los problemas de estado de un Pokémon.");

        //Instancias elementos Recuperar Vitalidad
        RecuperarVitalidad r1 = new RecuperarVitalidad("Poción",22,"Medicina en espray que cura heridas y restaura 20 PS a un Pokémon.");
        RecuperarVitalidad r2 = new RecuperarVitalidad("Revivir", 19,"Medicina que revive a un Pokémon debilitado y le devuelve la mitad de sus PS.");
        RecuperarVitalidad r3 = new RecuperarVitalidad("Superpoción",100,"Medicina en espray que cura heridas y restaura 50 PS de un Pokémon.");
        RecuperarVitalidad r4 = new RecuperarVitalidad("Limonada",6,"Bebida muy dulce que restaura 80 PS de un Pokémon.");
        RecuperarVitalidad r5 = new RecuperarVitalidad("Leche Mu-mu",12,"Leche de alto valor nutritivo que restaura 100 PS de un Pokémon.");
        RecuperarVitalidad r6 = new RecuperarVitalidad("Caramelo Raro",99,"Caramelo energético que sube a un Pokémon de nivel.");
        RecuperarVitalidad r7 = new RecuperarVitalidad("Agua Fresca",2,"Agua de alto contenido mineral que restaura 50 PS de un Pokémon.");
        RecuperarVitalidad r8 = new RecuperarVitalidad("Hiperpoción",101,"Medicina en espray que cura heridas y restaura 200 PS de un Pokémon.");
        RecuperarVitalidad r9 = new RecuperarVitalidad("Raíz Energía",105,"Raíz muy amarga que restaura 200 PS de un Pokémon.");

        //Instancias elementos Recuperar
        CambioPP p1 = new CambioPP("Elixir",10,"Restaura 10 PP de todos los movimientos aprendidos por el Pokémon elegido.");
        CambioPP p2 = new CambioPP("Elixir Maximo", 20,"Restaura completamente los PP de todos los movimientos aprendidos por el Pokémon elegido.");
        CambioPP p3 = new CambioPP("Éter",20,"Restaura 10 PP del movimiento elegido de un Pokémon.");
        CambioPP p4 = new CambioPP("Éter Maximo",30,"Restaura completamente los PP del movimiento elegido de un Pokémon.");
        CambioPP p5 = new CambioPP("Más PP",38,"Aumenta ligeramente los PP máximos del movimiento elegido de un Pokémon.");
        CambioPP p6 = new CambioPP("PP Máximos",56,"Aumenta hasta el límite los PP máximos del movimiento elegido de un Pokémon.");

       //Instancias Mejora de estadísticas
        MejorarEstadisticas m1 = new MejorarEstadisticas("Ataque X",89,"Aumenta el Ataque en combate. Al intercambiar de Pokémon, el efecto desaparece.");
        MejorarEstadisticas m2 = new MejorarEstadisticas("Calcio",44,"Nutritiva bebida que potencia el Ataque Especial de base de un Pokémon.");
        MejorarEstadisticas m3 = new MejorarEstadisticas("Carburante",54,"Nutritiva bebida que potencia la Velocidad de base de un Pokémon.");
        MejorarEstadisticas m4 = new MejorarEstadisticas("Defenza Espacial X",99,"Aumenta la Defensa Especial en combate. Al cambiar de Pokémon, el efecto desaparece.");
        MejorarEstadisticas m5 = new MejorarEstadisticas("Defenza X",101,"Aumenta la Defensa en combate. Al cambiar de Pokémon, el efecto desaparece.");
        MejorarEstadisticas m6 = new MejorarEstadisticas("Velocidad X",110,"Aumenta la Velocidad en combate. Al cambiar de Pokémon, el efecto desaparece.");
        MejorarEstadisticas m7 = new MejorarEstadisticas("Precisión X",98,"Aumenta la Precisión de los ataques en combate. Al cambiar de Pokémon, el efecto desaparece.");
        MejorarEstadisticas m8 = new MejorarEstadisticas("Pluma Mente",126,"Pluma que aumenta un poco la Defensa Especial de base de un Pokémon.");
        MejorarEstadisticas m9 = new MejorarEstadisticas("Pluma Músculo",99,"Pluma que aumenta un poco el Ataque de base de un Pokémon.");
        MejorarEstadisticas m10 = new MejorarEstadisticas("Pluma Vigor",100,"Pluma que aumenta un poco los PS de base de un Pokémon");
        MejorarEstadisticas m11 = new MejorarEstadisticas("Pluma Aguante",111,"Pluma que aumenta un poco la Defensa de base de un Pokémon.");
        MejorarEstadisticas m12 = new MejorarEstadisticas("Pluma ímpetu",113,"Pluma que aumenta un poco la Velocidad de base de un Pokémon.");
        MejorarEstadisticas m13 = new MejorarEstadisticas("Pluma Intelecto",140,"Pluma que aumenta un poco el Ataque Especial de base de un Pokémon.");
        MejorarEstadisticas m14 = new MejorarEstadisticas("Hierro",50,"Nutritiva bebida que potencia la Defensa de base de un Pokémon.");

        //Instancias Bayas
        Bayas b1 = new Bayas("Baya Atania",12,"Los Pokémon pueden llevarla o usarla para despertar del sueño.");
        Bayas b2 = new Bayas("Baya Zreza",16,"Los Pokémon pueden llevarla o usarla para recuperarse de los parálisis");
        Bayas b3 = new Bayas("Baya Meloc",19,"Los Pokémon pueden llevarla o usarla para curarse del envenenamiento.");
        Bayas b4 = new Bayas("Baya Aranja",5,"Los Pokémon pueden llevarla o usarla para restaurar 10PS.");
        Bayas b5 = new Bayas("Baya Peragu",2,"Uno de los famosos ingredientes para preparar Pokochos, los dulces para Pokémon de la región de Sinnoh.");
        Bayas b6 = new Bayas("Baya Latano",3,"Uno de los famosos ingredientes para preparar Pokochos, los dulces para Pokémon de la región de Sinnoh.");
        Bayas b7 = new Bayas("Baya Perasi",10,"Los Pokémon pueden levarla o usarla para descongelarse.");
        Bayas b8 = new Bayas("Baya Gualot",11,"Si la lleva un Pokémon, debilita un ataque supereficaz de tipo Eléctrico de un enemigo.");

        //Instancias Objetos Clave
        Obj_clave cl1 = new Obj_clave("Bici Acrobática",89,"Bici plegable ideal para saltar y hacer caballitos y giros.");
        Obj_clave cl2 = new Obj_clave("Super Caña",50,"Increíble caña de pescar de alta tecnología. Pesca Pokémon salvajes en todo tipo de aguas.");
        Obj_clave cl3 = new Obj_clave("Monedero",15,"Te servirá para llevar hasta 9999 fichas.");
        Obj_clave cl4 = new Obj_clave("Caña Buena",20,"Caña de pescar nuevecita y de gran calidad. Pesca Pokémon salvajes en todo tipo de aguas.");
        Obj_clave cl5 = new Obj_clave("Busca Obejtos",31,"Detector de objetos invisibles por ondas sonoras.");
        Obj_clave cl6 = new Obj_clave("Camára Lucha",38,"Un fantástico dispositivo que graba combates entre amigos o celebrados en algún recinto especial.");
        Obj_clave c17 = new Obj_clave("Planta Bayas",44,"Dispositivo portátil de cultivo que permite plantar Bayas en cualquier momento de forma sencilla.");
        Obj_clave c18 = new Obj_clave("Regadera",10,"Objeto que contiene agua y se usa para regar las Bayas del Plantabayas.");

        //Instancias PokeBalls
        PokeBall k1 = new PokeBall("Ultra Ball",20,"oké Ball de rendimiento superior. Tiene un índice de éxito mayor al de la Super Ball.");
        PokeBall k2 = new PokeBall("Super Ball",9,"Poké Ball de alto rendimiento. Tiene un índice de éxito superior al de la Poké Ball.");
        PokeBall k3 = new PokeBall("Poké Ball",5,"Dispositivo con diseño capsular que atrapa Pokémon salvajes. Se lanza como una bola contra el blanco.");
        PokeBall k4 = new PokeBall("Máster Ball",11,"La Poké Ball definitiva. Atrapa cualquier Pokémon salvaje y no falla nunca.");
        PokeBall k5 = new PokeBall("Honor Ball",15,"Es una Poké Ball algo singular que se creó para conmemorar algún acontecimiento.");
        PokeBall k6 = new PokeBall("Lujo Ball",18,"Acogedora Poké Ball que hace más amistosos a los Pokémon salvajes capturados.");

        //Instancias Objetos
        Objetos o1 = new Objetos("Agua Mística",67,"Gema con forma de gota de agua que fortalece los movimientos de tipo Agua. Debe lleverla un Pokémon.");
        Objetos o2 = new Objetos("Diamansfera",18,"Una esfera brillante que potencia los movimientos de tipo Acero y Dragón. Debe llevarla Dialga.");
        Objetos o3 = new Objetos("Gema Dragón",22,"Joya de un solo uso que potencia los movimientos de tipo Dragón. Debe llevarla un Pokémon.");
        Objetos o4 = new Objetos("Huevo Suerte",15,"Es un huevo lleno de felicidad que te hace ganar Puntos de");
        Objetos o5 = new Objetos("Hierva Unica",10,"Permite el uso inmediato de cualquier movimiento en el primer turno. Es de un solo uso y debe llevarla un Pokémon.");
        Objetos o6 = new Objetos("Lutresfera",12,"Una bonita esfera que potencia los movimientos de tipo Dragón y Agua. Debe llevarla Palkia.");
        Objetos o7 = new Objetos("Pañuelo Elegido",3,"Debe llevarlo un Pokémon. Potencia la Velocidad, pero solo permite usar un movimiento.");
        Objetos o8 = new Objetos("Telescopio",80,"Debe llevarlo un Pokémon. Si se mueve después del enemigo, aumenta la Precisión del Pokémon.");
        Objetos o9 = new Objetos("Roca Calor",77,"Prolonga la duración del movimiento Día Soleado que use el Pokémon que la lleva.");
        Objetos o10 = new Objetos("Vidaesfera",76,"Potencia los movimientos, pero consume PS con cada ataque. Debe llevarla un Pokémon.");


    }
}