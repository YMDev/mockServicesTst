package a3tech_Mock.controller;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;

import a3tech_Mock.A3techEvenementMissionType;
import a3tech_Mock.A3techEvenementiMission;
import a3tech_Mock.A3techMission;
import a3tech_Mock.A3techMissionStatut;
import a3tech_Mock.A3techUser;
import a3tech_Mock.A3techUserType;
import a3tech_Mock.interfaces.EducationException;
import a3tech_Mock.interfaces.IA3techMissionService;

@Controller
public class MissionController implements IA3techMissionService {

	public String createMission(String mission) {
		// TODO Auto-generated method stub
		return null;
	}

	@RequestMapping(method = RequestMethod.POST, value = "/mission/filtreMission")
	@ResponseBody
	public String filtreMission(@RequestParam("lang") String lang, @RequestParam("connectedUser") String connectedUser,
			@RequestParam("keyWord") String keyWord, @RequestParam("distance") String distance,
			@RequestParam("services") String services, @RequestParam("start") String start,
			@RequestParam("limit") String limit, @RequestParam("key") String key,
			@RequestParam("typeTransaction") String typeTransaction, @RequestParam("premium") String premium,
			String password, int order, int type) {
		List<A3techMission> missions = new ArrayList<A3techMission>();
		A3techMission mm1 = new A3techMission();
		A3techUser tech = new A3techUser();
		tech.setNbrReview(33);
		tech.setNbrMission(33);
		tech.setTypeUser(A3techUserType.TECHNICIEN);
		tech.setNom("BOUHJRA");
		tech.setPrenom("Mouad");
		tech.setRating(3f);
		tech.setAdresse("adresse");
		mm1.setTechnicien(tech);
		mm1.getTechnicien().setNom("mouad");
		mm1.getTechnicien().setPrenom("bouhjra");
		mm1.setAdresse("adresse mission 1");
		mm1.setDescriptionMission("cat description");
		mm1.setDateCreation(new Date().getTime());
		mm1.setDateIntervention(new Date().getTime());
		mm1.setStatut(A3techMissionStatut.CREE);
		mm1.setAdresse("Hay Riad, Rabat Maroc P10200");
		mm1.setTitre("Installation Climatiseur");
		mm1.setEvenement(new ArrayList<>());
		A3techEvenementiMission ev1 = new A3techEvenementiMission();
		ev1.setDateDebut(new Date().getTime());
		ev1.setTitre("Céation de la demande");
		ev1.setDescription("Mission en Climatisation, pour installer un Clim dans une Villa, 01/10/2013 12:22; par M. KAMALI");
		ev1.setType(A3techEvenementMissionType.CREATION);
		
		A3techEvenementiMission ev2 = new A3techEvenementiMission();
		ev2.setDateDebut(new Date().getTime());
		ev2.setTitre("Validation de la demande");
		ev2.setType(A3techEvenementMissionType.VALIDATION);
		
		
		mm1.getEvenement().add(ev1);
		mm1.getEvenement().add(ev2);
		mm1.getEvenement().add(ev1);
		mm1.getEvenement().add(ev2);
		mm1.getEvenement().add(ev1);
		mm1.getEvenement().add(ev2);
		missions.add(mm1);
		missions.add(mm1);
		missions.add(mm1);
		missions.add(mm1);
		missions.add(mm1);
		missions.add(mm1);
		missions.add(mm1);
		Type listType = new TypeToken<List<A3techMission>>() {
		}.getType();

		if(keyWord != null && keyWord.equals("M")) {
			return new Gson().toJson(missions.subList(0, 2), listType);
		}
		return new Gson().toJson(missions, listType);
	}

	public String deleteMission(String identifiant, String idUser, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@RequestMapping(method = RequestMethod.POST, value = "/mission/updateMission")
	@ResponseBody
	public A3techMission updateMission(@RequestParam("mission") String mission) {
		System.out.println(mission);
		A3techMission missionObject = new Gson().fromJson(mission, A3techMission.class);
		System.out.println(missionObject.getTechnicien().getRating());
		return missionObject;
	}

	@RequestMapping(method = RequestMethod.POST, value = "/mission/calculeMontantMission")
	@ResponseBody
	public Double calculeMontantMission(@RequestParam("mission") String mission) {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return new Double(333343);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/mission/calculeDureeMission")
	@ResponseBody
	public String calculeDureeMission(@RequestParam("mission") String mission) {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		Gson ss = new Gson();
		JsonObject jj = new JsonObject();
		jj.addProperty("result", new String("Heures et 40min"));
		return jj.toString();
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/mission/missionCanBeReportedOrCanceled")
	@ResponseBody
	public String missionCanBeReportedOrCanceled(@RequestParam("mission") String mission) {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(1200);
		} catch (Exception e) {
			// TODO: handle exception
		}
		Gson ss = new Gson();
		JsonObject jj = new JsonObject();
		jj.addProperty("result", Boolean.FALSE);
		return jj.toString();
	}

}
