package com.mmcoe.IPL_Assignment;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        IPL ipl = new IPL();

        // -------------------------------------------------------
        // 1. Mumbai Indians (MI)
        // -------------------------------------------------------
        Team mi = new Team("Mumbai Indians");
        mi.addPlayer(new Player("Rohit Sharma",        18_00_00_000L));
        mi.addPlayer(new Player("Ryan Rickelton",       12_00_00_000L));
        mi.addPlayer(new Player("Suryakumar Yadav",    14_00_00_000L));
        mi.addPlayer(new Player("Tilak Verma",          12_00_00_000L));
        mi.addPlayer(new Player("Will Jacks",            2_00_00_000L));
        mi.addPlayer(new Player("Naman Dhir",            4_00_00_000L));
        mi.addPlayer(new Player("Hardik Pandya",        18_00_00_000L));
        mi.addPlayer(new Player("Allah Ghazanfar",       1_00_00_000L));
        mi.addPlayer(new Player("Trent Boult",           8_00_00_000L));
        mi.addPlayer(new Player("Deepak Chahar",         4_00_00_000L));
        mi.addPlayer(new Player("Jasprit Bumrah",       20_00_00_000L));
        mi.addPlayer(new Player("Robin Minz",               25_00_000L));
        mi.addPlayer(new Player("Mitchell Santner",      4_00_00_000L));
        mi.addPlayer(new Player("Shardul Thakur",        4_00_00_000L));
        mi.addPlayer(new Player("Ashwani Kumar",            25_00_000L));
        ipl.addTeam(mi);

        // -------------------------------------------------------
        // 2. Chennai Super Kings (CSK)
        // -------------------------------------------------------
        Team csk = new Team("Chennai Super Kings");
        csk.addPlayer(new Player("MS Dhoni",            20_00_00_000L));
        csk.addPlayer(new Player("Ruturaj Gaikwad",     18_00_00_000L));
        csk.addPlayer(new Player("Rachin Ravindra",     18_00_00_000L));
        csk.addPlayer(new Player("Shivam Dube",         12_00_00_000L));
        csk.addPlayer(new Player("Ravindra Jadeja",     18_00_00_000L));
        csk.addPlayer(new Player("Sameer Rizvi",         8_00_00_000L));
        csk.addPlayer(new Player("Deepak Hooda",         2_00_00_000L));
        csk.addPlayer(new Player("Anshul Kamboj",        2_00_00_000L));
        csk.addPlayer(new Player("Khaleel Ahmed",        5_00_00_000L));
        csk.addPlayer(new Player("Matheesha Pathirana",  13_00_00_000L));
        csk.addPlayer(new Player("Noor Ahmad",           10_00_00_000L));
        csk.addPlayer(new Player("Devon Conway",         12_00_00_000L));
        csk.addPlayer(new Player("Nathan Ellis",          2_00_00_000L));
        csk.addPlayer(new Player("Jamie Overton",         2_00_00_000L));
        csk.addPlayer(new Player("Ramakrishna Ghosh",       20_00_000L));
        ipl.addTeam(csk);

        // -------------------------------------------------------
        // 3. Royal Challengers Bengaluru (RCB)
        // -------------------------------------------------------
        Team rcb = new Team("Royal Challengers Bengaluru");
        rcb.addPlayer(new Player("Virat Kohli",         21_00_00_000L));
        rcb.addPlayer(new Player("Rajat Patidar",       11_00_00_000L));
        rcb.addPlayer(new Player("Phil Salt",            11_50_00_000L));
        rcb.addPlayer(new Player("Liam Livingstone",     8_75_00_000L));
        rcb.addPlayer(new Player("Glenn Maxwell",        11_00_00_000L));
        rcb.addPlayer(new Player("Krunal Pandya",        5_25_00_000L));
        rcb.addPlayer(new Player("Tim David",            8_00_00_000L));
        rcb.addPlayer(new Player("Jitesh Sharma",        11_00_00_000L));
        rcb.addPlayer(new Player("Bhuvneshwar Kumar",    10_50_00_000L));
        rcb.addPlayer(new Player("Rasikh Dar",           4_60_00_000L));
        rcb.addPlayer(new Player("Josh Hazlewood",       12_50_00_000L));
        rcb.addPlayer(new Player("Yash Dayal",           5_00_00_000L));
        rcb.addPlayer(new Player("Swapnil Singh",         3_40_00_000L));
        rcb.addPlayer(new Player("Suyash Sharma",        2_60_00_000L));
        rcb.addPlayer(new Player("Nuwan Thushara",       4_80_00_000L));
        ipl.addTeam(rcb);

        // -------------------------------------------------------
        // 4. Kolkata Knight Riders (KKR)
        // -------------------------------------------------------
        Team kkr = new Team("Kolkata Knight Riders");
        kkr.addPlayer(new Player("Ajinkya Rahane",       1_50_00_000L));
        kkr.addPlayer(new Player("Quinton de Kock",      3_60_00_000L));
        kkr.addPlayer(new Player("Angkrish Raghuvanshi",  3_00_00_000L));
        kkr.addPlayer(new Player("Venkatesh Iyer",       23_75_00_000L));
        kkr.addPlayer(new Player("Andre Russell",        12_00_00_000L));
        kkr.addPlayer(new Player("Rinku Singh",          13_00_00_000L));
        kkr.addPlayer(new Player("Sunil Narine",         12_00_00_000L));
        kkr.addPlayer(new Player("Ramandeep Singh",       4_20_00_000L));
        kkr.addPlayer(new Player("Moeen Ali",             2_00_00_000L));
        kkr.addPlayer(new Player("Varun Chakravarthy",   12_00_00_000L));
        kkr.addPlayer(new Player("Harshit Rana",         18_00_00_000L));
        kkr.addPlayer(new Player("Spencer Johnson",       2_80_00_000L));
        kkr.addPlayer(new Player("Anrich Nortje",        12_50_00_000L));
        kkr.addPlayer(new Player("Mayank Markande",       1_00_00_000L));
        kkr.addPlayer(new Player("Luvnith Sisodia",         20_00_000L));
        ipl.addTeam(kkr);

        // -------------------------------------------------------
        // 5. Delhi Capitals (DC)
        // -------------------------------------------------------
        Team dc = new Team("Delhi Capitals");
        dc.addPlayer(new Player("KL Rahul",             14_00_00_000L));
        dc.addPlayer(new Player("Jake Fraser-McGurk",    7_00_00_000L));
        dc.addPlayer(new Player("Faf du Plessis",        2_00_00_000L));
        dc.addPlayer(new Player("Axar Patel",           16_50_00_000L));
        dc.addPlayer(new Player("Tristan Stubbs",        2_40_00_000L));
        dc.addPlayer(new Player("Ashutosh Sharma",       3_80_00_000L));
        dc.addPlayer(new Player("Sameer Rizvi",          3_20_00_000L));
        dc.addPlayer(new Player("Mohit Sharma",          12_00_00_000L));
        dc.addPlayer(new Player("T Natarajan",           10_75_00_000L));
        dc.addPlayer(new Player("Kuldeep Yadav",         13_25_00_000L));
        dc.addPlayer(new Player("Mitchell Starc",        11_75_00_000L));
        dc.addPlayer(new Player("Mukesh Kumar",          8_00_00_000L));
        dc.addPlayer(new Player("Donovan Ferreira",       1_00_00_000L));
        dc.addPlayer(new Player("Darshan Nalkande",       1_00_00_000L));
        dc.addPlayer(new Player("Madhav Tiwari",            30_00_000L));
        ipl.addTeam(dc);

        // -------------------------------------------------------
        // 6. Gujarat Titans (GT)
        // -------------------------------------------------------
        Team gt = new Team("Gujarat Titans");
        gt.addPlayer(new Player("Shubman Gill",         16_50_00_000L));
        gt.addPlayer(new Player("Jos Buttler",           15_75_00_000L));
        gt.addPlayer(new Player("Sai Sudharsan",         8_50_00_000L));
        gt.addPlayer(new Player("Shahrukh Khan",         7_40_00_000L));
        gt.addPlayer(new Player("Rahul Tewatia",         14_00_00_000L));
        gt.addPlayer(new Player("Washington Sundar",     3_20_00_000L));
        gt.addPlayer(new Player("Kagiso Rabada",          3_00_00_000L));
        gt.addPlayer(new Player("Mohammed Siraj",        12_25_00_000L));
        gt.addPlayer(new Player("Prasidh Krishna",       9_50_00_000L));
        gt.addPlayer(new Player("Rashid Khan",           18_00_00_000L));
        gt.addPlayer(new Player("Gerald Coetzee",         2_00_00_000L));
        gt.addPlayer(new Player("Arshad Khan",            2_20_00_000L));
        gt.addPlayer(new Player("Mahipal Lomror",         1_00_00_000L));
        gt.addPlayer(new Player("Nishant Sindhu",         2_60_00_000L));
        gt.addPlayer(new Player("Anuj Rawat",             1_20_00_000L));
        ipl.addTeam(gt);

        // -------------------------------------------------------
        // 7. Lucknow Super Giants (LSG)
        // -------------------------------------------------------
        Team lsg = new Team("Lucknow Super Giants");
        lsg.addPlayer(new Player("Rishabh Pant",        27_00_00_000L));
        lsg.addPlayer(new Player("Nicholas Pooran",     21_00_00_000L));
        lsg.addPlayer(new Player("David Miller",         7_50_00_000L));
        lsg.addPlayer(new Player("Ayush Badoni",         7_80_00_000L));
        lsg.addPlayer(new Player("Aiden Markram",        2_00_00_000L));
        lsg.addPlayer(new Player("Ravi Bishnoi",        11_00_00_000L));
        lsg.addPlayer(new Player("Mitchell Marsh",       11_00_00_000L));
        lsg.addPlayer(new Player("Akash Deep",          9_25_00_000L));
        lsg.addPlayer(new Player("Mayank Yadav",        11_00_00_000L));
        lsg.addPlayer(new Player("Avesh Khan",           3_60_00_000L));
        lsg.addPlayer(new Player("Yuvraj Chaudhary",     1_30_00_000L));
        lsg.addPlayer(new Player("Aryan Juyal",             20_00_000L));
        lsg.addPlayer(new Player("Himmat Singh",          1_00_00_000L));
        lsg.addPlayer(new Player("Matthew Breetzke",      1_40_00_000L));
        lsg.addPlayer(new Player("Digvesh Rathi",            30_00_000L));
        ipl.addTeam(lsg);

        // -------------------------------------------------------
        // 8. Punjab Kings (PBKS)
        // -------------------------------------------------------
        Team pbks = new Team("Punjab Kings");
        pbks.addPlayer(new Player("Shreyas Iyer",       26_75_00_000L));
        pbks.addPlayer(new Player("Prabhsimran Singh",  11_00_00_000L));
        pbks.addPlayer(new Player("Marcus Stoinis",      11_00_00_000L));
        pbks.addPlayer(new Player("Glenn Phillips",       7_50_00_000L));
        pbks.addPlayer(new Player("Nehal Wadhera",        4_40_00_000L));
        pbks.addPlayer(new Player("Harpreet Brar",        6_50_00_000L));
        pbks.addPlayer(new Player("Azmatullah Omarzai",   5_50_00_000L));
        pbks.addPlayer(new Player("Marco Jansen",         13_00_00_000L));
        pbks.addPlayer(new Player("Arshdeep Singh",       18_00_00_000L));
        pbks.addPlayer(new Player("Yuzvendra Chahal",    18_00_00_000L));
        pbks.addPlayer(new Player("Xavier Bartlett",       2_60_00_000L));
        pbks.addPlayer(new Player("Harnoor Pannu",          20_00_000L));
        pbks.addPlayer(new Player("Pyla Avinash",           20_00_000L));
        pbks.addPlayer(new Player("Suryansh Shedge",       40_00_000L));
        pbks.addPlayer(new Player("Vishwanath Pratap Singh", 20_00_000L));
        ipl.addTeam(pbks);

        // -------------------------------------------------------
        // 9. Rajasthan Royals (RR)
        // -------------------------------------------------------
        Team rr = new Team("Rajasthan Royals");
        rr.addPlayer(new Player("Sanju Samson",         18_00_00_000L));
        rr.addPlayer(new Player("Yashasvi Jaiswal",     18_00_00_000L));
        rr.addPlayer(new Player("Jos Buttler",           11_00_00_000L));
        rr.addPlayer(new Player("Riyan Parag",          14_00_00_000L));
        rr.addPlayer(new Player("Shimron Hetmyer",       11_00_00_000L));
        rr.addPlayer(new Player("Dhruv Jurel",           14_00_00_000L));
        rr.addPlayer(new Player("Wanindu Hasaranga",     1_50_00_000L));
        rr.addPlayer(new Player("Jofra Archer",          17_50_00_000L));
        rr.addPlayer(new Player("Trent Boult",            3_00_00_000L));
        rr.addPlayer(new Player("Sandeep Sharma",         5_00_00_000L));
        rr.addPlayer(new Player("Maheesh Theekshana",    4_60_00_000L));
        rr.addPlayer(new Player("Nitish Rana",            4_20_00_000L));
        rr.addPlayer(new Player("Shubham Dubey",          3_80_00_000L));
        rr.addPlayer(new Player("Fazalhaq Farooqi",       2_00_00_000L));
        rr.addPlayer(new Player("Kunal Rathore",            20_00_000L));
        ipl.addTeam(rr);

        // -------------------------------------------------------
        // 10. Sunrisers Hyderabad (SRH)
        // -------------------------------------------------------
        Team srh = new Team("Sunrisers Hyderabad");
        srh.addPlayer(new Player("Pat Cummins",          18_50_00_000L));
        srh.addPlayer(new Player("Heinrich Klaasen",     23_00_00_000L));
        srh.addPlayer(new Player("Travis Head",          14_00_00_000L));
        srh.addPlayer(new Player("Abhishek Sharma",      14_00_00_000L));
        srh.addPlayer(new Player("Ishan Kishan",         11_25_00_000L));
        srh.addPlayer(new Player("Nitish Kumar Reddy",  13_25_00_000L));
        srh.addPlayer(new Player("Aniket Verma",          3_60_00_000L));
        srh.addPlayer(new Player("Harshal Patel",        18_00_00_000L));
        srh.addPlayer(new Player("Mohammed Shami",       10_00_00_000L));
        srh.addPlayer(new Player("Zeeshan Ansari",        2_00_00_000L));
        srh.addPlayer(new Player("Simarjeet Singh",       1_60_00_000L));
        srh.addPlayer(new Player("Adam Zampa",            2_40_00_000L));
        srh.addPlayer(new Player("Rahul Chahar",          3_00_00_000L));
        srh.addPlayer(new Player("Atharva Taide",           20_00_000L));
        srh.addPlayer(new Player("Brydon Carse",          2_00_00_000L));
        ipl.addTeam(srh);

        // -------------------------------------------------------
        // User Input
        // -------------------------------------------------------
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Team Name or Player Name : ");
        String input = sc.nextLine();

        // First, check if input matches a team name
        Team foundTeam = ipl.searchTeam(input);

        if (foundTeam != null) {

            foundTeam.displayPlayers();

        } else {

            // Not a team — search for a player across all teams
            Object[] result = ipl.searchPlayer(input);

            if (result != null) {

                Player p    = (Player) result[0];
                Team   team = (Team)   result[1];

                System.out.println("\nPlayer Found");
                System.out.println("-------------------------------------------");
                System.out.println("Player Name : " + p.getName());
                System.out.println("Team Name   : " + team.getTname());
                System.out.println("Base Price  : " + p.getPrice());

            } else {

                System.out.println("No Team or Player Found.");

            }
        }

        sc.close();
    }
}