package com.TP1;

public class CMMQuizz implements QuizzMaster {
	private String question;
    private String [] choix;
    private int reponse;
    private String type;

    public CMMQuizz ()
    {
    	choix = new String [4];
    	question = "3.	La m�thode  CMM (Capability Maturity Model) se divise en :";
    	choix[0] = "a)	3 niveaux";
    	choix[1] = "b)	4 niveaux";
    	choix[2] = "c)	5 niveaux";
    	choix[3] = "d)	6 niveaux";
    	reponse = 2;
    	type="Question sur CMM";
     }
	
    @Override
	public String getChoix(int indice) {
		return choix[indice];
	}

	@Override
	public String getQuestion() {
		return question;
	}

	@Override
	public int getReponse() {
		return reponse;
	}
	
	@Override
	public String getType() {
		return type;
	}

}
