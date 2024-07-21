class NetFlix{
static String top10Movies[] = {"Gangs of Godavari", "Lapata ladies", "article370", "Shaitaan", "Crew", "safe house", "Bade Miyan Chote Miya", "under Paris", "focus", "spider-man"};
static String hindiMovies[] = {"Dunki", "jawan", "OMG", "Darlings", "GanguBai", "shehazada", "khufiya", "GumRaah", "Bhakshak", "Mimi", "83", "mili", "Hit", "Bulbul", "Major", "Jersey", "Queen", "Ok Jaanu", "Dhak Dhak", "Talaash", "Sanju", "Om shanti om", "Malang", "Malaal", "Raees"};
public static void main(String[] ottPlatform){
System.out.println("The top10Movies are :-");
for(String top10Movies:top10Movies){
System.out.println(top10Movies);
}
System.out.println("The hindiMovies are:-");
for(int index=0;index<hindiMovies.length;index++){
System.out.println(hindiMovies[index]);
}
}
}
