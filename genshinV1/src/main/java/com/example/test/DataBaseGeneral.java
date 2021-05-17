package com.example.test;

import java.util.Map;
import java.util.Optional;

import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.cache.CacheManager;
import org.springframework.cache.concurrent.ConcurrentMapCache;
import org.springframework.cache.concurrent.ConcurrentMapCacheManager;
import org.springframework.core.io.InputStreamResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

import com.itextpdf.text.DocumentException;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import org.springframework.http.*;
@Controller
public class DataBaseGeneral implements CommandLineRunner {
	//List<Equipo> equipos = new ArrayList<>();
	//List<Personaje> personajes = new ArrayList<>();
	//List<Armas> armas = new ArrayList<>();
	//List<Artefactos> artefactos = new ArrayList<>();
	Equipo equipo1= new Equipo();
	@Autowired
	private ArtefactosRepository ArtefactosRepository;

	@Autowired
	private ArmasRepository ArmasRepository;

	@Autowired
	private PJRepository PjRepository;
	@Autowired
	private EquipoRepository EquipoRepository;
	
	@Autowired
	private UsuarioRepository ur;
	
	@Autowired
    private CacheManager cacheManager;

    @RequestMapping(value="/cache", method=RequestMethod.GET)
    public Map<Object, Object> getCacheContent (){
        ConcurrentMapCacheManager cacheMgr = (ConcurrentMapCacheManager) cacheManager;
        ConcurrentMapCache cache = (ConcurrentMapCache) cacheMgr.getCache("personajes");
        return cache.getNativeCache();
    }
	
	@Override
	public void run(String... args) throws Exception {
			User u1 = new User("a","a" , "ROLE_USER");
			ur.save(u1);
		
			PjRepository.save(new Personaje("Diluc", "Pyro", 90, 12981, 335, 0, 784, 0, 24, 50, 0, 0,
					"https://i2.wp.com/www.korosenai.es/wp-content/uploads/2020/10/diluc-genshin-impact.jpg?w=640&ssl=1"));
			PjRepository.save(new Personaje("Bennet", "Pyro", 90, 12397, 191, 0, 771, 0, 5, 50, 0, 26,
					"https://i2.wp.com/www.korosenai.es/wp-content/uploads/2020/12/bennett-genshin-impact.jpg?w=640&ssl=1"));
			PjRepository.save(new Personaje("Ganyu", "Cryo", 90, 9797, 336, 0, 630, 0, 5, 88, 0, 0,
					"https://i0.wp.com/www.korosenai.es/wp-content/uploads/2021/01/ganyu-genshin-impact.jpg?w=640&ssl=1"));
			PjRepository.save(new Personaje("Chongyun", "Cyro", 90, 10984, 223, 24, 648, 0, 5, 50, 0, 0,
					"https://i1.wp.com/www.korosenai.es/wp-content/uploads/2020/11/chongyun-genshin-impact.jpg?w=640&ssl=1"));
			PjRepository.save(new Personaje("Keching", "Electro", 90, 13103, 323, 0, 799, 0, 5, 88, 0, 0,
					"https://i1.wp.com/www.korosenai.es/wp-content/uploads/2020/12/keching-genshin-impact.jpg?w=640&ssl=1"));
			PjRepository.save(new Personaje("Fischl", "Electro", 90, 9189, 244, 24, 594, 0, 5, 50, 0, 0,
					"https://i1.wp.com/www.korosenai.es/wp-content/uploads/2020/10/fischl-genshin-impact.jpg?w=640&ssl=1"));
			PjRepository.save(new Personaje("Xiao", "Anemo", 90, 12736, 349, 0, 799, 0, 24, 50, 0, 0,
					"https://i0.wp.com/www.korosenai.es/wp-content/uploads/2021/02/xiao-genshin-impact.jpg?w=640&ssl=1"));
			PjRepository.save(new Personaje("Sucrose", "Anemo", 90, 9244, 170, 0, 703, 0, 5, 50, 24, 0,
					"https://i2.wp.com/www.korosenai.es/wp-content/uploads/2020/12/sacarosa-genshin-impact.jpg?w=640&ssl=1"));
			PjRepository.save(new Personaje("Zhongli", "Geo", 90, 14695, 251, 0, 738, 0, 5, 50, 29, 0,
					"https://i1.wp.com/www.korosenai.es/wp-content/uploads/2020/12/zhongli-genshin-impact.jpg?w=640&ssl=1"));
			PjRepository.save(new Personaje("Ninguang", "Geo", 90, 9787, 212, 0, 573, 0, 5, 50, 24, 0,
					"https://i1.wp.com/www.korosenai.es/wp-content/uploads/2021/01/ninguang-genshin-impact.jpg?w=640&ssl=1"));
			PjRepository.save(new Personaje("Mona", "Hydro", 90, 10409, 287, 0, 653, 0, 5, 50, 0, 32,
					"https://i0.wp.com/www.korosenai.es/wp-content/uploads/2020/12/mona-genshin-impact.jpg?w=640&ssl=1"));
			PjRepository.save(new Personaje("Xingqiu", "Hydro", 90, 10222, 202, 24, 758, 0, 5, 50, 0, 0,
					"https://i1.wp.com/www.korosenai.es/wp-content/uploads/2020/10/xingchiu-genshin-impact.jpg?w=640&ssl=1"));

			//personajes = PjRepository.findAll();
		
		//personajes = PjRepository.findAll();
		// Rareza, Nombre, TipoDeArma, Estadistica1, Estadistica2,Descripcion

		// Mandobles
		/*
		this.name=name;
		this.atribute=atribute;
		this.level=level;
		this.MaxHP=MaxHP;
		this.ATK=ATK;
		this.PATK=PATK;
		this.DEF=DEF;
		this.mastery=mastery;
		this.ProbCrit=ProbCrit;
		this.DanyoCrit=DanyoCrit;
		this.ElementalBonus=ElementalBonus;
		this.EnergyRecharge=EnergyRecharge;	*/
		
		
			
			ArmasRepository.save(new Armas("5", "The Unforged", "Mandoble", 608, 49, 0, "PATK", "Increases Shield Strength by 20/25/30/35/40%, scoring hits on opponents increases ATK by 4/5/6/7/8% for 8s. Max 5 stacks. Can only occur once every 0.3s. While protected by a shield this ATK increase effect is increased by 100%."));
			
			ArmasRepository.save(new Armas("5", "Wolf's Gravestone", "Mandobles",608, 49, 40,"PATK","Increases ATK by 20/25/30/35/40%. On hit, attacks against enemies with less than 30% HP increase all party members' ATK by 40/50/60/70/80% for 12s. Can only occur once every 30s."));
			ArmasRepository.save(new Armas("5", "Skyward Pride", "Mandobles", 674, 36,0,"PER","Increases all DMG by 8/10/12/14/16%. After using an Elemental Burst, Normal or Charged Attack, on hit, creates a vacuum blade that does 80/100/120/140/160% of ATK as DMG to enemies along its path. Lasts for 20s or 8 vacuum blades."));

			ArmasRepository.save(new Armas("4", "Favonius Greatsword", "Mandobles",454,61,0,"PER","CRIT hits have a 60/70/80/90/100% chance to generate 1 Elemental Orb, which will regenerate 6 Energy for the character. Can only occur once every 12/10.5/9/7.5/6s."));
			ArmasRepository.save(new Armas("4", "Prototype Archaic", "Mandobles",565,27,0,"PATK", "On hit, Normal or Charged Attacks have a 50% chance to deal an additional 240/300/360/420/480% ATK DMG to enemies within a small radius. Can only occur once every 15s."));
			ArmasRepository.save(new Armas("4", "Whiteblind", "Mandobles",510, 51, 0, "PDEF","On hit, Normal or Charged Attacks increase ATK and DEF by 6/7.5/9/10.5/12% for 6s. Max 4 stacks. Can only occur once every 0.5s."));

			ArmasRepository.save(new Armas("3", "Bloodtainted Greatsword", "Mandobles ",354,187,0,"EM","Increases DMG against enemies affected by Pyro or Electro by 12/15/18/21/24%."));
			ArmasRepository.save(new Armas("3", "Debate Club", "Mandobles ",401, 35, 0, "PATK","After using an Elemental Skill, Normal or Charged Attacks, on hit, deal an additional 60/75/90/105/120% ATK DMG in a small area. Effect lasts 15s. DMG can only occur once every 3s."));
			ArmasRepository.save(new Armas("3", "Ferrous Shadow", "Mandobles ", 401, 35, 0,"PHP","When HP falls below 70/75/80/85/90%, increases Charged Attack DMG by 30/35/40/45/50%, and Charged Attacks become much harder to interrupt."));
			// Espadas
			ArmasRepository.save(new Armas("5", "Aquila Favonia", "Espada", 674,41,40,"PEB", "ATK is increased by 20/25/30/35/40%. Triggers on taking DMG: the soul of the Falcon of the West awakens, holding the banner of the resistance aloft, regenerating HP equal to 100/115/130/145/160% of ATK and dealing 200/230/260/290/320% of ATK as DMG to surrounding enemies. This effect can only occur once every 15s"));
			ArmasRepository.save(new Armas("5", "Skyward Blade", "Espadas", 608, 55,8,"PER","Crit Rate increased by 4/5/6/7/8%. Gains Skypiercing Might upon using Elemental Burst: Increases Movement SPD by 10%, increases ATK SPD by 10%, and increases the DMG of Normal and Charged Attack hits by 20/25/30/35/40% for 12s."));
			ArmasRepository.save(new Armas("5", "Summit Shaper", "Espadas", 608, 49,40,"PATK","Increases Shield Strength by 20/25/30/35/40%. Scoring hits on opponents increases ATK by 4/5/6/7/8% for 8s. Max 5 stacks. Can only occur once every 0.3s. While protected by a shield, this TK increase effect is increased by 100%"));

			ArmasRepository.save(new Armas("4", "Favonius Sword", "Espadas", 454, 61,0,"PER","CRIT hits have a 60/70/80/90/100% chance to generate 1 Elemental Orb, which will regenerate 6 Energy for the character. Can only occur once every 12/10.5/9/7.5/6s."));
			ArmasRepository.save(new Armas("4", "Lion's Roar", "Espadas",510, 41, 0, "PATK","Increases DMG against enemies affected by Pyro or Electro by 20/24/28/32/36%."));
			ArmasRepository.save(new Armas("4", "Sacrificial Sword", "Espadas", 454, 61, 0, "PER","After damaging an opponent with an Elemental Skill, the skill has a 40/50/60/70/80% chance to end its own CD. Can only occur once every 30/26/22/18/16s."));

			ArmasRepository.save(new Armas("3", "Cool Steel", "Espadas", 401, 35, 0, "PATK","Increases DMG against enemies affected by Hydro or Cryo by 12/15/18/21/24%."));
			ArmasRepository.save(new Armas("3", "Fillet Blade", "Espadas",401, 35, 0 , "PATK","On hit, has a 50% chance to deal 240/280/320/360/400% ATK DMG to a single enemy. Can only occour once every 15/14/13/12/11s."));
			ArmasRepository.save(new Armas("3", "Skyrider Sword", "Espadas", 354, 51, 0, "PER", "Using an Elemental Burst grants a 12/15/18/21/24% increase in ATK and Movement SPD for 15s."));
			// Lanzas
			ArmasRepository.save(new Armas("5", "Vortex Vanquisher", "Lanza", 608, 49, 40, "PATK","Increases Shield Strength by 20/25/30/35/40%. Scoring hits on opponents increases ATK by 4/5/6/7/8% for 8s. Max 5 stacks. Can only occur once every 0.3s. While protected by a shield, this ATK increase effect is increased by 100%."));
			ArmasRepository.save(new Armas("5", "Primordial Jade Winged Spear", "Lanza", 674, 22, 0, "PCR","On hit, increases ATK by 3.2/3.9/4.6/5.3/6.0 % for 6s. Max 7 stacks. This effect can only occur once ever 0.3s. While in possession of the maximum possible stacks, DMG dealt is increased by 12/15/18/21/24%."));
			ArmasRepository.save(new Armas("5", "Skyward Spine", "Lanza", 674, 36, 16, "PER","Increases CRIT Rate by 8/10/12/14/16% and increases Normal ATK SPD by 12%. Additionally, Normal and Charged Attacks hits on enemies have a 50% chance to trigger a vaccuum blade that deals 40/55/70/85/100% of ATK as DMG in a small AoE. This effect can occur no more than once every 2s."));

			ArmasRepository.save(new Armas("4", "Favonious Lance", "Lanza", 565, 30,0,"PER", "CRIT hits have a 60/70/80/90/100% chance to generate 1 Elemental Orb, which will regenerate 6 Energy for the character. Can only occur once every 12/10.5/9/7.5/6s."));
			ArmasRepository.save(new Armas("4", "Royal Spear", "Lanza", 565, 27,0, "PATK","Upon damaging an enemy, increases CRIT Rate by 8/10/12/14/16%. Max 5 stacks. A CRIT hit removes all stacks."));
			ArmasRepository.save(new Armas("4", "Prototype Grudge", "Lanza",501, 45, 0, "PER","After using an Elemental Skill, increases Normal and Charged Attack DMG by 8/10/12/14/16% for 12s. Max 2 stacks."));
			ArmasRepository.save(new Armas("3", "Black Tassel", "Lanza", 354, 46, 0, "PHP","Increases DMG against slimes by 40/50/60/70/80%."));
			ArmasRepository.save(new Armas("3", "Halberd", "Lanza",448, 22, 0, "PATK","Normal Attacks deal and additional 160/200/240/280/320% DMG. Can only occur once every 10s."));
			ArmasRepository.save(new Armas("3", "White Tassel", "Lanza",401, 22, 48, "PCR", "Increased Normal Attack DMG by 24/30/36/42/48%."));
			// Arcos
			ArmasRepository.save(new Armas("5", "Skyward Harp", "Arco", 674, 22, 40, "PCR","Increases CRIT DMG by 20/25/30/35/40%. Hits have a 60/70/80/90/100% chance to inflict a small AoE attack, dealing 125% Physical ATK DMG. Can only occur once every 4/3.5/3/2.5/2s"));
			ArmasRepository.save(new Armas("5", "Amos' Bow", "Arco", 608, 49, 24, "PATK","Increases Normal Attack and Aimed Shot DMG by 12/15/18/21/24%. Increases DMG from arrows shot by a further 8/10/12/14/16% for every 0.1s that the arrow is in flight, up to 0.5s"));

			ArmasRepository.save(new Armas("4", "Favonius Warbow", "Arco", 454, 61, 0, "PER","CRIT hits have a 60/70/80/90/100% chance to generate 1 Elemental Orb, which will regenerate 6 Energy for the character. Can only occur once every 12/10.5/9/7.5/6s."));
			ArmasRepository.save(new Armas("4", "Prototype Crescent", "Arco",501, 41, 0, "PATK" ,"Aimed Shot hits on weak points increase Movement SPD by 10% and ATK by 36/45/54/63/72% for 10s."));
			ArmasRepository.save(new Armas("4", "Royal Bow", "Arco",510, 41, 0, "PATK","Upon damaging an opponent, increases CRIT Rate by 8/10/12/14/16%. Max 5 stacks. A CRIT hit removes all stacks."));

			ArmasRepository.save(new Armas("3", "Messenger", "Arco", 448, 31, 0, "PCRD","Aimed Shot hits on weak spots deal and additional 100/125/150/175/200% ATK DMG as CRIT DMG. Can only occur once every 10s."));
			ArmasRepository.save(new Armas("3", "Recurve Bow", "Arco",354, 46, 0, "PHP","Defeating an opponent restores 8/10/12/14/16% HP."));
			ArmasRepository.save(new Armas("3", "Slingshot", "Arco", 354, 31, 0, "PCR","If a Normal Attack or Aimed Shot hits a target within 0.3s of being fired, increases DMG by 36/42/48/54/60%. Otherwise, it decreases DMG by 10%."));
			// Catalizadores
			ArmasRepository.save(new Armas("5", "Lost Prayer to the Sacred Winds", "Catalizador",608, 33, 10, "PCR","Increases Movement SPD by 10%. When in battle, gain an 8/10/12/14/16% Elemental DMG Bonus every 4s. Max 4 stacks. Lasts until the character falls or leaves combat."));
			ArmasRepository.save(new Armas("5", "Skyward Atlas", "Catalizador", 674, 33, 24, "PATK","Increases Elemental DMG Bonus by 12/15/18/21/24%. Normal Attack hits have a 50% chance to earn the favor of the clouds. which actively seek out nearby enemies to attack for 15s, dealing 160/200/240/280/320% ATK DMG. Can only occur once every 30s."));
			ArmasRepository.save(new Armas("5", "Memory of Dust", "Catalizador", 608, 49, 40, "PATK","Increases Shield Strength by 20/25/30/35/40%. Scoring hits on opponents increases ATK by 4/5/6/7/8% for 8s. Max 5 stacks. Can only occur once every 0.3s. While protected by a shield, this ATK increase effect is increased by 100%"));

			ArmasRepository.save(new Armas("4", "Favonious Codex", "Catalizador",510, 45, 0, "PER","CRIT hits have a 60/70/80/90/100% chance to generate 1 Elemental Orb, which will regenerate 6 Energy for the character. Can only occur once every 12/10.5/9/7.5/6s."));
			ArmasRepository.save(new Armas("4", "Eye of Perception", "Catalizador", 454,55, 0, "PATK","Normal and Charged Attacks have a 50% chance to fire a Bolt of Perception, dealing 240/270/300/330/360% ATK as DMG. This bolt can bounce between enemies a maximum of 4 times. This effect can occur once every 12/11/10/9/8s."));
			ArmasRepository.save(new Armas("4", "Mappa Mare", "Catalizador", 565, 110, 0, "EM","Triggering an Elemental reaction grants a 8/10/12/14/16% Elemental DMG Bonus for 10s. Max 2 stacks."));

			ArmasRepository.save(new Armas("3", "Emerald Orb", "Catalizador", 448, 94, 0, "EM","Upon causing a Vaporize, Electro-Charged, Frozen, or a Hydro-infused Swirl reaction, increases Base ATK by 20/25/30/35/40% for 12s."));
			ArmasRepository.save(new Armas("3", "Otherwordly Story", "Catalizador",401, 39, 0, "PER","Each Elemental Orb or Particle collected restores 1/1.25/1.5/1.75/2% HP."));
			ArmasRepository.save(new Armas("3", "Thrilling Tales of Dragon Slayers", "Catalizador", 401, 35, 0, "PHP","When switching characters, the new character taking the field has their ATK increased by 24/30/36/42/48% for 10s. This effect can only occur once every 20s."));

			//armas = ArmasRepository.findAll();
		
		
			ArtefactosRepository.save(new Artefactos("5 estrellas", "Noblesse Oblige", "Elemental Burst DMG +20%",
					"using an Elemental Burst increases all party members' ATK by 20% for 12s. This effect cannot stack", 20, 0));
			ArtefactosRepository.save(new Artefactos("5 estrellas", "Gladiator's Finale", "ATK +18%",
					"If the wielder of this artifact set uses a Sword, Claymore, or Polearm, increases their Normal attack DMG by 35%", 18, 0));
			ArtefactosRepository.save(new Artefactos("5 estrellas", "Maiden Beloved",
					"Character Healing Effectiveness +15%",
					"using an Elemental Skill or Burst increases healing recieved by all party members by 20% for 10s", 15,0));

			ArtefactosRepository.save(new Artefactos("4 estrellas", "Instructor", "Increases Elemental Mastery by 80",
					"After causing an elemental reaction, increases all party members' Elemental Mastery by 120 for 8s", 80, 0));
			ArtefactosRepository.save(new Artefactos("4 estrellas", "Berserker", "Crit Rate +12%",
					"When HP is below 70%, Crit Rate increases by an additional 24%", 12, 0));
			ArtefactosRepository
					.save(new Artefactos("4 estrellas", "Prayers for Wisdom", "Affected by Electro for 40% less time","Electro dmg 15%", 0, 15));

			ArtefactosRepository.save(new Artefactos("3 estrellas", "Adventurer", "Max HP increased by 1,000",
					"Opening a chest regenerates 30% Max HP over 5s",1000, 0));
			ArtefactosRepository.save(new Artefactos("3 estrellas", "Traveling Doctor", "Increases incoming healing by 20%",
					"Using Elemental Burst restores 20% HP", 20,0));
			ArtefactosRepository.save(
					new Artefactos("3 estrellas", "Lucky Dog", "DEF increased by 100", "Picking up Mora restores 300 HP",100,0));

			/*artefactos = ArtefactosRepository.findByRareza("5 estrellas");
			for (Artefactos artefacto : artefactos) {
				System.out.println(artefacto);
			}

			artefactos = ArtefactosRepository.findByNombre("Noblesse Oblige");
			for (Artefactos artefacto : artefactos) {
				System.out.println(artefacto);
			}
			artefactos = ArtefactosRepository.findByNombre("Noblesse Oblige");
			for (Artefactos artefacto : artefactos) {
				artefacto.SingleSet(artefacto.getNombre(), artefacto.getRareza(), artefacto.getBuff1());
			}

			artefactos = ArtefactosRepository.findAll();
			*/
		}
		//equipos = EquipoRepository.findAll();
	

	@GetMapping("/personajes")
	public String iterationPJS(Model model1) {
		model1.addAttribute("personajes", PjRepository.findAll());
		return "backup-Personajes";
	}

	@GetMapping("/armas")
	public String iterationArmas(Model model2) {
		model2.addAttribute("armas", ArmasRepository.findAll());
		return "backup-armas";
	}

	@GetMapping("/Artefacto")
	public String iterationArtefactos(Model model3) {
		model3.addAttribute("artefactos", ArtefactosRepository.findAll());
		return "Artefactos";
	}

	@GetMapping("/Equipo")
	public String iterationEquipo(Model model0, Model model1, Model model2, Model model3) {
		model0.addAttribute("equipos", EquipoRepository.findAll());
		model1.addAttribute("personajes", PjRepository.findAll());
		model2.addAttribute("armas", ArmasRepository.findAll());
		model3.addAttribute("artefactos", ArtefactosRepository.findAll());
		return "Equipo";
	}

	@GetMapping("/")
	public String iterationHello(Model model3) {
		return "hola-mundo";
	}

	@PostMapping("/listaEquipo")
	public String equipo(Model model, @RequestParam String PJ, @RequestParam String ARMA,
			@RequestParam String ARTEFACTO) throws Exception {
		// model.addAttribute("PJ", PJ);
		// model.addAttribute("ARMA", ARMA);
		// model.addAttribute("ARTEFACTO", ARTEFACTO);
		Equipo equipo= new Equipo();
		// Personaje pj1 = new Personaje();
		// Armas a1 = new Armas();
		// Artefactos art1 = new Artefactos();
		boolean a = false;
		boolean b = false;
		boolean c = false;
		for (Personaje PJ1 : PjRepository.findByName(PJ)) {
			if (PJ1.getName().equalsIgnoreCase(PJ)) {
				equipo.setPj(PJ1);
				a = true;
			}
		}
		for (Armas arma1 : ArmasRepository.findByNombre(ARMA)) {
			if (arma1.getNombre().equalsIgnoreCase(ARMA)) {
				equipo.setArm(arma1);
				b = true;
			}
		}
		for (Artefactos artefacto1 : ArtefactosRepository.findByNombre(ARTEFACTO)) {
			if (artefacto1.getNombre().equalsIgnoreCase(ARTEFACTO)) {
				equipo.setArtefact1(artefacto1);
				c = true;
			}
		}
		if (a == true && b == true && c == true) {
			//EquipoRepository.save(equipo);
			equipo1=equipo;
			EquipoRepository.save(equipo1);
			//equipos.add(equipo1);
			
		} else {
			System.out.println("error");
		}
		
		//personajes = PjRepository.findAll();
		//armas = ArmasRepository.findAll();
		//artefactos = ArtefactosRepository.findAll();
		//EquipoRepository.save(equipo);
		model.addAttribute("equipo", equipo1);
		
		return "redirect:/listaEquipo";

	}
	
	@GetMapping("/listaEquipo")
	public String iterationlistaEquipo(Model model3) {
		model3.addAttribute("equipos", EquipoRepository.findAll());
		return "listaEquipo";
	}
	
	@GetMapping("/guardar/{id}")
	public String guardarEquipo(Model model, @PathVariable long id) {
		Optional<Equipo> op = EquipoRepository.findById(id);
		if(op.isPresent()) {
			Equipo equipo = op.get();
			model.addAttribute("equipo", equipo);
			return "EquipoGuardado";
		}	
		return "listaEquipo";
	}
	@GetMapping("/verEquipo/{id}")
    public String verEquipo(Model model, @PathVariable long id) {
		Optional<Equipo> op = EquipoRepository.findById(id);
		if(op.isPresent()) {
			EquipoRepository.findById(id).get().calculadora();
			EquipoRepository.save(EquipoRepository.findById(id).get());
			model.addAttribute("equipo", EquipoRepository.findById(id).get());
			return "verEquipo";
		}	
		return "listaEquipo";
		
    }
	
	@GetMapping("/devolver")
	  public String devolverEquipo(Model model) {
		//return "equipoPDF.pdf";
		return "texto.txt";
		
	}
	
	
	@Autowired
	ResourceLoader resourceLoader;
	
	@GetMapping("/generarPDF/{id}")
    public String generararPDF(Model model, @PathVariable long id) throws IOException, DocumentException {

		
		RestTemplate restTemplate = new RestTemplate();
       
	 	 //byte[] pdf = restTemplate.getForObject("http://localhost:8080/descargarPDF/" + id, byte[].class);
	     //Resource resource=resourceLoader.getResource("classpath:static/equipoPDF.pdf");
	     //FileUtils.writeByteArrayToFile((file),test.getBytes());
		
		
        String test = restTemplate.getForObject("http://localhost:8080/descargarPDF/" + id, String.class); 
        //Resource resource=resourceLoader.getResource("classpath:static/texto.txt");
        //Resource resource=resourceLoader.getResource("classpath:/home/adrian/Escritorio/dad/texto.txt");
        //File file = resource.getFile();
        
        //BufferedWriter writer = new BufferedWriter(new FileWriter(file));
        //writer.write(test);
        //writer.close();
        model.addAttribute("test", test);
        return "descarga";
	
     
      

        
       

    }		
	}
		
//public String generatePDF(@PathVariable long id) throws IOException {
//body.add("Authorization", "Basic " +  Base64Utils.encode(userAndPass.getBytes()));
//headers.setAccept(Collections.singletonList(MediaType.APPLICATION_OCTET_STREAM));
//HttpEntity<String> entity = new HttpEntity<>(headers);



/*
        InputStreamResource r = new InputStreamResource(new FileInputStream(file));
        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Disposition",  String.format("attachment; filename=\"%s\"",  file.getName()));
        headers.add("Cache-Control",  "no-cache, no store, must-revalidate");
        headers.add("Pragma", "no-cache");
        headers.add("Expires",  "0");
        
        ResponseEntity<Object> resposeEntity = ResponseEntity.ok().headers(headers)
		.contentLength(file.length()).contentType(MediaType.parseMediaType("application/text")).body(r);
 * 
PDDocument document = new PDDocument();
PDPage page = new PDPage();
document.addPage(page);

PDPageContentStream contentStream = new PDPageContentStream(document, page);

contentStream.setFont(PDType1Font.COURIER, 12);
contentStream.beginText();
contentStream.showText("Hello World");
contentStream.endText();
contentStream.close();
document.save(file);
document.close();

*/


