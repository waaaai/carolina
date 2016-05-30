package model;

import java.util.ArrayList;
import java.util.Calendar;

public class UserCandidate {
	private String eventId;
	private String itemId;
	private ArrayList<Calendar> userCandidate;
	private ArrayList<String> candidateRemark;
	private ArrayList<Integer> preferredFlagSet;//希望日時ごとのフラグ 1:参加,0:不参加(初期値), 2:△


}
