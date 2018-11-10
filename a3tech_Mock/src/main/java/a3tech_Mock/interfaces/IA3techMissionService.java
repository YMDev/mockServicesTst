package a3tech_Mock.interfaces;

import a3tech_Mock.A3techMission;

public interface IA3techMissionService {

    public String createMission(String mission);
    public String filtreMission(String lang, String connectedUser, String keyWord, String distance, String services, String start, String limit, String key, String typeTransaction, String premium, String password,
                                             int order, int type);
    String deleteMission(String identifiant,  String idUser,String password);

    A3techMission updateMission(String mission);
    Double calculeMontantMission(String mission);
     String calculeDureeMission(String mission);
     String missionCanBeReportedOrCanceled(String mission);
}
