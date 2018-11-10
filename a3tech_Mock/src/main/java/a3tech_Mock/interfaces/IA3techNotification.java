package a3tech_Mock.interfaces;

import java.util.List;

import a3tech_Mock.A3techNotification;

public interface IA3techNotification {
	public String createNotification(String notification);
	public List<A3techNotification> filtreNotification(String lang, Long connectedUser, String keyWord, String start, String limit, String key, final Long missionID,final Long userTechID, String password, int order, int type);
	public String deleteNotification(Long idNotification, Long idUser, String password, boolean isTech);
}
