package Lesson_27.Pattern_FactoryMethod.Task_Duty;

public class DutyCreator implements DutyFactory{
    @Override
    public Duty createDuty(String day){
            if(day.equalsIgnoreCase("Monday")){
                return new DutyDesigners();
            } else if (day.equalsIgnoreCase("Tuesday")){
                return new DutyManagers();
            }else if (day.equalsIgnoreCase("Wednesday")){
                return new DutyAccounts();
            }else if (day.equalsIgnoreCase("Thursday")){
                return new DutyDevelopers();
            }else if (day.equalsIgnoreCase("Friday")){
                return new DutyEnginers();
            }else if (day.equalsIgnoreCase("Saturday")){
                return new DutyMarketingSpecialists();
            } else {
                throw new RuntimeException(day+"is unkown");
            }
        }
    }

