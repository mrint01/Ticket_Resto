package com.example.service;

import java.time.LocalDateTime;

import com.example.models.ClientEntity;
import com.example.models.TableEntity;

public interface FunctionService {
	
	// Pour une période donnée quel est le plat le plus acheté ? 
	String getPlatMostBuy(LocalDateTime date1 , LocalDateTime date2);
	// Quel est le client le plus fidèle au restaurant ?
	ClientEntity getMostLoyalClient();
	// Quelle est la table la plus réservée ?
	TableEntity getMostBookedTable();
	// Quel est le jour de la semaine le plus réservé par un client donné ? 
	String getMostDayReservedForClient(int id);
	// Retourner le revenu par jour, semaine et mois.
	String getIncomePerDayWeekMonth();
	// Retourner le revenu pour une période donnée.
	String getIncomeForGivenPeriod(LocalDateTime date1 , LocalDateTime date2);
	

}
