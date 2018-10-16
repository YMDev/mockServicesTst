package a3tech_Mock;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import a3tech_Mock.interfaces.EducationException;
import a3tech_Mock.interfaces.IA3techUserService;

@Controller
public class UserController implements IA3techUserService {
	@RequestMapping(method = RequestMethod.POST, value = "/student/allstudent")
	@ResponseBody
	public String getAllStudents(@RequestParam("start") String start, @RequestParam("end") String end ) {
		 Type listType = new TypeToken<List<A3techUser>>(){}.getType();
		 System.out.println(start);
		 System.out.println(end);
	 
		 index = 0;
		List<A3techUser> liste  =  getTechnicienNearLocation(null, null, null);
		if(liste.size() >  Integer.valueOf(end) && liste.size() >  Integer.valueOf(start)) {
			List<A3techUser> res = liste.subList(Integer.valueOf(start), Integer.valueOf(end));
			return new Gson().toJson(res,listType);
		}else if(liste.size() >  Integer.valueOf(start)){
			List<A3techUser> res = liste.subList(Integer.valueOf(start), liste.size());
			return new Gson().toJson(res,listType);
		}else {
			 System.out.println("nulll");
			return null;
		}
		
	}
	

    public List<A3techUser> getTechnicienNearLocation(String latitude, String longitude, String ville)  {
        List<A3techUser> listeRetour = new ArrayList<A3techUser>();
        A3techUser ss= getUserMocked("YASMINE", "SMMSMMM");
        ss.setId(99999999L);
        listeRetour.add(ss);
        listeRetour.add(getUserMocked("BOUHJRA", "Mouad"));
        listeRetour.add(getUserMocked("RAFIK", "HAKIM"));
        listeRetour.add(getUserMocked("ADNANI", "AHMED"));
        listeRetour.add(getUserMocked("DARIS", "Hassan"));
        listeRetour.add(getUserMocked("SLIMANI", "Kamal"));
        listeRetour.add(getUserMocked("BOUDIN", "Salim"));
        listeRetour.add(getUserMocked("SAMALI", "Saad"));
        listeRetour.add(getUserMocked("RAKI", "Mouhcine"));
        listeRetour.add(getUserMocked("VIDOL", "Youssef"));
        listeRetour.add(getUserMocked("GARICK", "Tarik"));
        listeRetour.add(getUserMocked("MOPISN", "Najib"));
        listeRetour.add(getUserMocked("EDROML", "Ismail"));
        listeRetour.add(getUserMocked("BOUZIDI", "Badr"));
        listeRetour.add(getUserMocked("BOUHJRA", "Mouad"));
        listeRetour.add(getUserMocked("RAFIK", "HAKIM"));
        listeRetour.add(getUserMocked("ADNANI", "AHMED"));
        listeRetour.add(getUserMocked("DARIS", "Hassan"));
        listeRetour.add(getUserMocked("SLIMANI", "Kamal"));
        listeRetour.add(getUserMocked("BOUDIN", "Salim"));
        listeRetour.add(getUserMocked("SAMALI", "Saad"));
        listeRetour.add(getUserMocked("RAKI", "Mouhcine"));
        listeRetour.add(getUserMocked("VIDOL", "Youssef"));
        listeRetour.add(getUserMocked("GARICK", "Tarik"));
        listeRetour.add(getUserMocked("MOPISN", "Najib"));
        listeRetour.add(getUserMocked("EDROML", "Ismail"));
        listeRetour.add(getUserMocked("BOUZIDI", "Badr"));
        listeRetour.add(getUserMocked("BOUHJRA", "Mouad"));
        listeRetour.add(getUserMocked("RAFIK", "HAKIM"));
        listeRetour.add(getUserMocked("ADNANI", "AHMED"));
        listeRetour.add(getUserMocked("DARIS", "Hassan"));
        listeRetour.add(getUserMocked("SLIMANI", "Kamal"));
        listeRetour.add(getUserMocked("BOUDIN", "Salim"));
        listeRetour.add(getUserMocked("SAMALI", "Saad"));
        listeRetour.add(getUserMocked("RAKI", "Mouhcine"));
        listeRetour.add(getUserMocked("VIDOL", "Youssef"));
        listeRetour.add(getUserMocked("GARICK", "Tarik"));
        listeRetour.add(getUserMocked("MOPISN", "Najib"));
        listeRetour.add(getUserMocked("EDROML", "Ismail"));
        listeRetour.add(getUserMocked("BOUZIDI", "Badr"));
        listeRetour.add(getUserMocked("BOUHJRA", "Mouad"));
        listeRetour.add(getUserMocked("RAFIK", "HAKIM"));
        listeRetour.add(getUserMocked("ADNANI", "AHMED"));
        listeRetour.add(getUserMocked("DARIS", "Hassan"));
        listeRetour.add(getUserMocked("SLIMANI", "Kamal"));
        listeRetour.add(getUserMocked("BOUDIN", "Salim"));
        listeRetour.add(getUserMocked("SAMALI", "Saad"));
        listeRetour.add(getUserMocked("RAKI", "Mouhcine"));
        listeRetour.add(getUserMocked("VIDOL", "Youssef"));
        listeRetour.add(getUserMocked("GARICK", "Tarik"));
        listeRetour.add(getUserMocked("MOPISN", "Najib"));
        listeRetour.add(getUserMocked("EDROML", "Ismail"));
        listeRetour.add(getUserMocked("BOUZIDI", "Badr"));
        listeRetour.add(getUserMocked("BOUHJRA", "Mouad"));
        listeRetour.add(getUserMocked("RAFIK", "HAKIM"));
        listeRetour.add(getUserMocked("ADNANI", "AHMED"));
        listeRetour.add(getUserMocked("DARIS", "Hassan"));
        listeRetour.add(getUserMocked("SLIMANI", "Kamal"));
        listeRetour.add(getUserMocked("BOUDIN", "Salim"));
        listeRetour.add(getUserMocked("SAMALI", "Saad"));
        listeRetour.add(getUserMocked("RAKI", "Mouhcine"));
        listeRetour.add(getUserMocked("VIDOL", "Youssef"));
        listeRetour.add(getUserMocked("GARICK", "Tarik"));
        listeRetour.add(getUserMocked("MOPISN", "Najib"));
        listeRetour.add(getUserMocked("EDROML", "Ismail"));
        listeRetour.add(getUserMocked("BOUZIDI", "Badr"));
        listeRetour.add(getUserMocked("BOUHJRA", "Mouad"));
        listeRetour.add(getUserMocked("RAFIK", "HAKIM"));
        listeRetour.add(getUserMocked("ADNANI", "AHMED"));
        listeRetour.add(getUserMocked("DARIS", "Hassan"));
        listeRetour.add(getUserMocked("SLIMANI", "Kamal"));
        listeRetour.add(getUserMocked("BOUDIN", "Salim"));
        listeRetour.add(getUserMocked("SAMALI", "Saad"));
        listeRetour.add(getUserMocked("RAKI", "Mouhcine"));
        listeRetour.add(getUserMocked("VIDOL", "Youssef"));
        listeRetour.add(getUserMocked("GARICK", "Tarik"));
        listeRetour.add(getUserMocked("MOPISN", "Najib"));
        listeRetour.add(getUserMocked("EDROML", "Ismail"));
        listeRetour.add(getUserMocked("BOUZIDI", "Badr"));
        listeRetour.add(getUserMocked("BOUHJRA", "Mouad"));
        listeRetour.add(getUserMocked("RAFIK", "HAKIM"));
        listeRetour.add(getUserMocked("ADNANI", "AHMED"));
        listeRetour.add(getUserMocked("DARIS", "Hassan"));
        listeRetour.add(getUserMocked("SLIMANI", "Kamal"));
        listeRetour.add(getUserMocked("BOUDIN", "Salim"));
        listeRetour.add(getUserMocked("SAMALI", "Saad"));
        listeRetour.add(getUserMocked("RAKI", "Mouhcine"));
        listeRetour.add(getUserMocked("VIDOL", "Youssef"));
        listeRetour.add(getUserMocked("GARICK", "Tarik"));
        listeRetour.add(getUserMocked("MOPISN", "Najib"));
        listeRetour.add(getUserMocked("EDROML", "Ismail"));
        listeRetour.add(getUserMocked("BOUZIDI", "Badr"));
        listeRetour.add(getUserMocked("BOUHJRA", "Mouad"));
        listeRetour.add(getUserMocked("RAFIK", "HAKIM"));
        listeRetour.add(getUserMocked("ADNANI", "AHMED"));
        listeRetour.add(getUserMocked("DARIS", "Hassan"));
        listeRetour.add(getUserMocked("SLIMANI", "Kamal"));
        listeRetour.add(getUserMocked("BOUDIN", "Salim"));
        listeRetour.add(getUserMocked("SAMALI", "Saad"));
        listeRetour.add(getUserMocked("RAKI", "Mouhcine"));
        listeRetour.add(getUserMocked("VIDOL", "Youssef"));
        listeRetour.add(getUserMocked("GARICK", "Tarik"));
        listeRetour.add(getUserMocked("MOPISN", "Najib"));
        listeRetour.add(getUserMocked("EDROML", "Ismail"));
        listeRetour.add(getUserMocked("BOUZIDI", "Badr"));
        listeRetour.add(getUserMocked("BOUHJRA", "Mouad"));
        listeRetour.add(getUserMocked("RAFIK", "HAKIM"));
        listeRetour.add(getUserMocked("ADNANI", "AHMED"));
        listeRetour.add(getUserMocked("DARIS", "Hassan"));
        listeRetour.add(getUserMocked("SLIMANI", "Kamal"));
        listeRetour.add(getUserMocked("BOUDIN", "Salim"));
        listeRetour.add(getUserMocked("SAMALI", "Saad"));
        listeRetour.add(getUserMocked("RAKI", "Mouhcine"));
        listeRetour.add(getUserMocked("VIDOL", "Youssef"));
        listeRetour.add(getUserMocked("GARICK", "Tarik"));
        listeRetour.add(getUserMocked("MOPISN", "Najib"));
        listeRetour.add(getUserMocked("EDROML", "Ismail"));
        listeRetour.add(getUserMocked("BOUZIDI", "Badr"));
        listeRetour.add(getUserMocked("BOUHJRA", "Mouad"));
        listeRetour.add(getUserMocked("RAFIK", "HAKIM"));
        listeRetour.add(getUserMocked("ADNANI", "AHMED"));
        listeRetour.add(getUserMocked("DARIS", "Hassan"));
        listeRetour.add(getUserMocked("SLIMANI", "Kamal"));
        listeRetour.add(getUserMocked("BOUDIN", "Salim"));
        listeRetour.add(getUserMocked("SAMALI", "Saad"));
        listeRetour.add(getUserMocked("RAKI", "Mouhcine"));
        listeRetour.add(getUserMocked("VIDOL", "Youssef"));
        listeRetour.add(getUserMocked("GARICK", "Tarik"));
        listeRetour.add(getUserMocked("MOPISN", "Najib"));
        listeRetour.add(getUserMocked("EDROML", "Ismail"));
        listeRetour.add(getUserMocked("BOUZIDI", "Badr"));
        listeRetour.add(getUserMocked("BOUHJRA", "Mouad"));
        listeRetour.add(getUserMocked("RAFIK", "HAKIM"));
        listeRetour.add(getUserMocked("ADNANI", "AHMED"));
        listeRetour.add(getUserMocked("DARIS", "Hassan"));
        listeRetour.add(getUserMocked("SLIMANI", "Kamal"));
        listeRetour.add(getUserMocked("BOUDIN", "Salim"));
        listeRetour.add(getUserMocked("SAMALI", "Saad"));
        listeRetour.add(getUserMocked("RAKI", "Mouhcine"));
        listeRetour.add(getUserMocked("VIDOL", "Youssef"));
        listeRetour.add(getUserMocked("GARICK", "Tarik"));
        listeRetour.add(getUserMocked("MOPISN", "Najib"));
        listeRetour.add(getUserMocked("EDROML", "Ismail"));
        listeRetour.add(getUserMocked("BOUZIDI", "Badr"));
        listeRetour.add(getUserMocked("BOUHJRA", "Mouad"));
        listeRetour.add(getUserMocked("RAFIK", "HAKIM"));
        listeRetour.add(getUserMocked("ADNANI", "AHMED"));
        listeRetour.add(getUserMocked("DARIS", "Hassan"));
        listeRetour.add(getUserMocked("SLIMANI", "Kamal"));
        listeRetour.add(getUserMocked("BOUDIN", "Salim"));
        listeRetour.add(getUserMocked("SAMALI", "Saad"));
        listeRetour.add(getUserMocked("RAKI", "Mouhcine"));
        listeRetour.add(getUserMocked("VIDOL", "Youssef"));
        listeRetour.add(getUserMocked("GARICK", "Tarik"));
        listeRetour.add(getUserMocked("MOPISN", "Najib"));
        listeRetour.add(getUserMocked("EDROML", "Ismail"));
        listeRetour.add(getUserMocked("BOUZIDI", "Badr"));
        listeRetour.add(getUserMocked("BOUHJRA", "Mouad"));
        listeRetour.add(getUserMocked("RAFIK", "HAKIM"));
        listeRetour.add(getUserMocked("ADNANI", "AHMED"));
        listeRetour.add(getUserMocked("DARIS", "Hassan"));
        listeRetour.add(getUserMocked("SLIMANI", "Kamal"));
        listeRetour.add(getUserMocked("BOUDIN", "Salim"));
        listeRetour.add(getUserMocked("SAMALI", "Saad"));
        listeRetour.add(getUserMocked("RAKI", "Mouhcine"));
        listeRetour.add(getUserMocked("VIDOL", "Youssef"));
        listeRetour.add(getUserMocked("GARICK", "Tarik"));
        listeRetour.add(getUserMocked("MOPISN", "Najib"));
        listeRetour.add(getUserMocked("EDROML", "Ismail"));
        listeRetour.add(getUserMocked("BOUZIDI", "Badr"));
        listeRetour.add(getUserMocked("BOUHJRA", "Mouad"));
        listeRetour.add(getUserMocked("RAFIK", "HAKIM"));
        listeRetour.add(getUserMocked("ADNANI", "AHMED"));
        listeRetour.add(getUserMocked("DARIS", "Hassan"));
        listeRetour.add(getUserMocked("SLIMANI", "Kamal"));
        listeRetour.add(getUserMocked("BOUDIN", "Salim"));
        listeRetour.add(getUserMocked("SAMALI", "Saad"));
        listeRetour.add(getUserMocked("RAKI", "Mouhcine"));
        listeRetour.add(getUserMocked("VIDOL", "Youssef"));
        listeRetour.add(getUserMocked("GARICK", "Tarik"));
        listeRetour.add(getUserMocked("MOPISN", "Najib"));
        listeRetour.add(getUserMocked("EDROML", "Ismail"));
        listeRetour.add(getUserMocked("BOUZIDI", "Badr"));
        
      
        listeRetour.get(3).setLatitude(34.263927);
        listeRetour.get(3).setLongitude(-6.569619);

        listeRetour.get(4).setLatitude(34.263431);
        listeRetour.get(4).setLongitude(-6.567302);

        listeRetour.get(5).setLatitude(34.263928);
        listeRetour.get(5).setLongitude(-6.569600);


        listeRetour.get(6).setLatitude(34.263937);
        listeRetour.get(6).setLongitude(-6.564619);


        listeRetour.get(7).setLatitude(34.263727);
        listeRetour.get(7).setLongitude(-6.565619);
        return listeRetour;
    }

    int index = 0;
    private A3techUser getUserMocked(String name, String pname) {
    	A3techUser userMocked = new A3techUser();
        userMocked.setEmail("hahhsas@mail.com");
        userMocked.setAdresse(index+"");
        userMocked.setTelephone("02922029292");
        userMocked.setDateCreation(new Date().getTime());
        userMocked.setDateNaissance(new Date().getTime());
        Random rand = new Random();
        int id = rand.nextInt(556550) + 1;
        userMocked.setId(Long.valueOf(id));
        int n = rand.nextInt(50) + 1;
        userMocked.setNbrMission(n);
        userMocked.setNom(name);
        userMocked.setPrenom(pname);
        userMocked.setPseudo(name);
        userMocked.setRating(Float.valueOf(rand.nextInt(5)));
        userMocked.setNbrReview(rand.nextInt(15));
        userMocked.setLatitude(34.267471);
        userMocked.setLongitude(-6.562630);
        index= index+1;
        return userMocked;
    }


    @RequestMapping(method = RequestMethod.POST, value = "/user/loginfb")
	@ResponseBody
	public A3techUser loginfb(@RequestParam("nom") String nom, @RequestParam("prenom") String prenom, @RequestParam("facebookId") String facebookId, @RequestParam("email") String email) throws EducationException {
		return getUserMocked("BOUHJRA", "Mouad");
	}


	public String contactSupport(String idUser, String message, String password) throws EducationException {
		// TODO Auto-generated method stub
		return null;
	}


	public String checkMobile(String tel, String idUser, String password) throws EducationException {
		// TODO Auto-generated method stub
		return null;
	}


	public String checkMail(String mail, String idUser, String password) throws EducationException {
		// TODO Auto-generated method stub
		return null;
	}


	public String validerMobile(String idUser, String password) throws EducationException {
		// TODO Auto-generated method stub
		return null;
	}

	@RequestMapping(method = RequestMethod.POST, value = "/user/getUser")
	@ResponseBody
	public A3techUser getUser(@RequestParam("login") String login, @RequestParam("password") String password) throws EducationException {
		// TODO Auto-generated method stub
		return getUserMocked("BOUHJRA", "Mouad");
	}


	public A3techUser createAccount(String nom, String prenom, String email, String password, String image,
			String regId, String pseudo) throws EducationException {
		// TODO Auto-generated method stub
		return null;
	}


	public String initPassword(String email, String newPassword) throws EducationException {
		// TODO Auto-generated method stub
		return null;
	}


	public String desabonnerUser(String idUser, String password) throws EducationException {
		// TODO Auto-generated method stub
		return null;
	}

	@RequestMapping(method = RequestMethod.POST, value = "/user/getProfil")
	@ResponseBody
	public A3techUser getProfil(@RequestParam("idUser") String idUser, @RequestParam("password") String password) throws EducationException {
		// TODO Auto-generated method stub
		return getUserMocked("BOUHJRA","Mouad");
	}


	public String updateProfil(String identifiant, String nom, String prenom, String tel, String pseudo,
			String categorie, String latitude, String longitude, String regId, String image, String mode,
			String distance, String srvc, String dateNaissance, String ville, String adresse, String password)
			throws EducationException {
		// TODO Auto-generated method stub
		return null;
	}


	public Integer changePassword(String oldPassword, String newPassword, String idUser) throws EducationException {
		// TODO Auto-generated method stub
		return null;
	}


	public List<A3techUser> getTechnicienNearLocation(String latitude, String longitude, String ville, int st, int en)
			throws EducationException {
		// TODO Auto-generated method stub
		return null;
	}

	@RequestMapping(method = RequestMethod.POST, value = "/user/techEnabled")
	@ResponseBody
	public List<Long> getListeUserToEnabledForClient(@RequestParam("clientId")  Long clientId) throws EducationException {
		List<A3techUser> liste  =  getTechnicienNearLocation(null, null, null);
		List<Long> listeResu = new ArrayList<Long>(); 
		int index = 0;
		for (A3techUser a3techUser : liste) {
			listeResu.add(a3techUser.getId());
			index ++;
			if(index <6 ) {
				break;
			}
		}
		listeResu.add(99999999L);
		return listeResu;
	}

	@RequestMapping(method = RequestMethod.POST, value = "/user/isTechnicienEnabledForClient")
	@ResponseBody
	public Boolean isTechnicienEnabledForClient(@RequestParam("clientId")  Long clientId, @RequestParam("TechId")  Long TechId) throws EducationException {
		System.out.println("client ID "+clientId);
		System.out.println("tech ID "+TechId);
		System.out.println("ezs ID "+new Long(99999999).equals(TechId));
		return new Long(99999999).equals(TechId);
	}

}
