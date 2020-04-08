
public class student {
	double quiz1Score;
	double quiz2Score;
	double quiz3Score;
	double quiz4Score;
	double midterm1Score;
	double midterm2Score;
	double finalScore;
	double overallScore;
	double totalQuiz;
	double totalMidterm;
	double weightedQuiz;
	double weightedMidterm;
	double weightedFinal;
	char finalLetterGrade;
	
	
	student(double q1,double q2,double q3,double q4,double m1,double m2,double f){
		this.quiz1Score=q1;
		this.quiz2Score=q2;
		this.quiz3Score=q3;
		this.quiz4Score=q4;
		this.midterm1Score=m1;
		this.midterm2Score=m2;
		this.finalScore=f;
		calculateScore();
		calculateLetterGrade();
		}
		
	public double getQuiz1Score() {
		return quiz1Score;
	}

	public void setQuiz1Score(double quiz1Score) {
		this.quiz1Score = quiz1Score;
	}

	public double getQuiz2Score() {
		return quiz2Score;
	}

	public void setQuiz2Score(double quiz2Score) {
		this.quiz2Score = quiz2Score;
	}

	public double getQuiz3Score() {
		return quiz3Score;
	}

	public void setQuiz3Score(double quiz3Score) {
		this.quiz3Score = quiz3Score;
	}

	public double getQuiz4Score() {
		return quiz4Score;
	}

	public void setQuiz4Score(double quiz4Score) {
		this.quiz4Score = quiz4Score;
	}

	public double getMidterm1Score() {
		return midterm1Score;
	}

	public void setMidterm1Score(double midterm1Score) {
		this.midterm1Score = midterm1Score;
	}

	public double getMidterm2Score() {
		return midterm2Score;
	}

	public void setMidterm2Score(double midterm2Score) {
		this.midterm2Score = midterm2Score;
	}

	public double getFinalScore() {
		return finalScore;
	}

	public void setFinalScore(double finalScore) {
		this.finalScore = finalScore;
	}

	public double getOverallScore() {
		return overallScore;
	}

	public void setOverallScore(double overallScore) {
		this.overallScore = overallScore;
	}

	public double getTotalQuiz() {
		return totalQuiz;
	}

	public void setTotalQuiz(double totalQuiz) {
		this.totalQuiz = totalQuiz;
	}

	public double getTotalMidterm() {
		return totalMidterm;
	}

	public void setTotalMidterm(double totalMidterm) {
		this.totalMidterm = totalMidterm;
	}

	public double getWeightedQuiz() {
		return weightedQuiz;
	}

	public void setWeightedQuiz(double weightedQuiz) {
		this.weightedQuiz = weightedQuiz;
	}

	public double getWeightedMidterm() {
		return weightedMidterm;
	}

	public void setWeightedMidterm(double weightedMidterm) {
		this.weightedMidterm = weightedMidterm;
	}

	public double getWeightedFinal() {
		return weightedFinal;
	}

	public void setWeightedFinal(double weightedFinal) {
		this.weightedFinal = weightedFinal;
	}

	public char getFinalLetterGrade() {
		return finalLetterGrade;
	}

	public void setFinalLetterGrade(char finalLetterGrade) {
		this.finalLetterGrade = finalLetterGrade;
	}

	public void calculateScore() {
		this.totalQuiz=this.quiz1Score+this.quiz2Score+this.quiz3Score+this.quiz4Score;
		this.totalMidterm=this.midterm1Score+this.midterm2Score;
		this.weightedQuiz=this.totalQuiz*0.25;
		this.weightedMidterm=this.totalMidterm*0.35;
		this.weightedFinal=this.finalScore*0.4;
		this.overallScore=this.weightedQuiz+this.weightedMidterm+this.weightedFinal;
		
				
	}
	
	public void calculateLetterGrade() {
		if(this.overallScore >=90) {
			this.finalLetterGrade='A';
		}
		
		else if(this.overallScore >=80) {
			this.finalLetterGrade='B';
		}
		
		else if(this.overallScore >=70) {
			this.finalLetterGrade='C';
		}
		
		else if(this.overallScore >=60) {
			this.finalLetterGrade='D';
		}
		
		else if(this.overallScore < 60) {
			this.finalLetterGrade='F';
		}
	}
	
	@Override
	public String toString() {
		return "student quiz1Score=" + quiz1Score + ", quiz2Score=" + quiz2Score + ", quiz3Score=" + quiz3Score
				+ ", quiz4Score=" + quiz4Score + ", midterm1Score=" + midterm1Score + ", midterm2Score=" + midterm2Score
				+ ", finalScore=" + finalScore + ", overallScore=" + overallScore + ", totalQuiz=" + totalQuiz
				+ ", totalMidterm=" + totalMidterm + ", weightedQuiz=" + weightedQuiz + ", weightedMidterm="
				+ weightedMidterm + ", weightedFinal=" + weightedFinal + ", finalLetterGrade=" + finalLetterGrade ;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + finalLetterGrade;
		long temp;
		temp = Double.doubleToLongBits(finalScore);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(midterm1Score);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(midterm2Score);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(overallScore);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(quiz1Score);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(quiz2Score);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(quiz3Score);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(quiz4Score);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(totalMidterm);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(totalQuiz);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(weightedFinal);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(weightedMidterm);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(weightedQuiz);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		student other = (student) obj;
		if (finalLetterGrade != other.finalLetterGrade)
			return false;
		if (Double.doubleToLongBits(finalScore) != Double.doubleToLongBits(other.finalScore))
			return false;
		if (Double.doubleToLongBits(midterm1Score) != Double.doubleToLongBits(other.midterm1Score))
			return false;
		if (Double.doubleToLongBits(midterm2Score) != Double.doubleToLongBits(other.midterm2Score))
			return false;
		if (Double.doubleToLongBits(overallScore) != Double.doubleToLongBits(other.overallScore))
			return false;
		if (Double.doubleToLongBits(quiz1Score) != Double.doubleToLongBits(other.quiz1Score))
			return false;
		if (Double.doubleToLongBits(quiz2Score) != Double.doubleToLongBits(other.quiz2Score))
			return false;
		if (Double.doubleToLongBits(quiz3Score) != Double.doubleToLongBits(other.quiz3Score))
			return false;
		if (Double.doubleToLongBits(quiz4Score) != Double.doubleToLongBits(other.quiz4Score))
			return false;
		if (Double.doubleToLongBits(totalMidterm) != Double.doubleToLongBits(other.totalMidterm))
			return false;
		if (Double.doubleToLongBits(totalQuiz) != Double.doubleToLongBits(other.totalQuiz))
			return false;
		if (Double.doubleToLongBits(weightedFinal) != Double.doubleToLongBits(other.weightedFinal))
			return false;
		if (Double.doubleToLongBits(weightedMidterm) != Double.doubleToLongBits(other.weightedMidterm))
			return false;
		if (Double.doubleToLongBits(weightedQuiz) != Double.doubleToLongBits(other.weightedQuiz))
			return false;
		return true;
	}
	
	
	
}

