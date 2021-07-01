package myinterface;

public class CarEngine implements Overheat{
	
	int rockdownTemperature = 500;
	int Temperature = 30;
	int coolingSpeed = 2;
	int coolingTemperature = 10;
	String condition = "";

	@Override
	public int overheating() {
		return Temperature++;
	}
	
	@Override
	public int cooling() {
		
		if (Temperature < 0) {
			return Temperature = 0;
		} else {
			Temperature -= coolingTemperature * coolingSpeed;	
		}
		return Temperature;
	}	
	
	@Override
	public String condition() {
		
		if (Temperature >= rockdownTemperature) {
			condition = "�����Ǿ� ������ �����մϴ�.";
		} else {
			condition = "������ �����ǰ� �ֽ��ϴ�.";
		}
		
		return condition;
	}
	
	
}
