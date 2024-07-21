class SportsMania{

static String iplTeamNames[]={"Royal Challengers Bengaluru", "Chennai Super Kings", "Mumbai Indians", "Kolkata Knight Riders", "Sunrises Hyderabad", "Rajastan Royals", 
"Delhi Capitals", "Gujarat Titans", "Lucknow Super Giants", "Punjab Kings"};
static String top10Bowlers[]={"Piyush chawla", "Dwayne Bravo", "Bhuvneshwar", "Sunil Narine", "Ravichandran Ashwin", "Amit Mishra", "Lasith Malinga", "jasprit Bumrah",
"Ravindra Jadeja", "Umesh Yadav"};
static String top10Batsman[]={"Virat Kohli", "Ruturaj Gaikwad", "Riyan Parag", "Travis Head", "Sanju Samson", "Sai Sudharshan", "KL Rahul", "Nicholas Pooran", "Sunil Narine",
"Abhishek Sharma"};
static String iccTeamNames[]={"Australia", "Bangladesh", "England", "India", "New Zealand", "South Africa", "Pakistan", "SriLanka", "West Indies", "Zimbabwe", "Bermuda",
"canada", "Ireland", "kenya", "Netherlands", "scotland", "Hong KOng", "Namibia", "Denmark", "Bahamas"};
public static void main(String[] ipl){

System.out.println("the iplTeamNames are :-");
for(int index=0;index<iplTeamNames.length;index++)
{
System.out.println(iplTeamNames[index]);
}
System.out.println("-----------------------------");
System.out.println("The top10Batsman are :-");
for(String top10Batsman:top10Batsman)
{
System.out.println(top10Batsman);
}
System.out.println("---------------------------");
System.out.println("The top10Bowlers are :-");
for ( String top10Bowlers:top10Bowlers){
System.out.println(top10Bowlers	);
}
System.out.println("--------------------------------------");
System.out.println("The iccTeamNames are:-");
for(int index=0;index<iccTeamNames.length;index++)
{
System.out.println(iccTeamNames[index]);
}
}
}