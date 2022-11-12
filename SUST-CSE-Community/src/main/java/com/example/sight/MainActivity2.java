package com.example.sight;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.SearchView;
import android.widget.Toast;

import androidx.core.view.MenuItemCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
//import androidx.recyclerview.widget.RecyclerView;
import com.example.sight.JavaClasses.Book;
import com.example.sight.JavaClasses.RecyclerViewAdapter;
import com.google.firebase.auth.FirebaseAuth;

import java.util.ArrayList;
import java.util.List;

public class MainActivity2 extends AppCompatActivity {
    //SearchView searchView;
    ArrayList<Book> lstBook;
    ArrayList<Book> models;
    RecyclerViewAdapter recyclerViewAdapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);




        lstBook = new ArrayList<>();

        // "A M S Rejuan","2006331041","No Recent Company Found", "Batch: 2006  || Position: N/A || Email: rejuan.shuvro@gmail.com || Contact No: 01750013513 ||"

        lstBook.add(new Book("A M S Rejuan","2006331041","No Recent Company Found", "Batch: 2006  || Position: N/A || Email: rejuan.shuvro@gmail.com || Contact No: 01750013513 ||", R.drawable.thevigitarian));
        lstBook.add(new Book("Aamira Shabnam","2010331042","Therap (BD) Ltd"," Batch: 2010  || Position: Ltd Software Engineer || Email: its.aamira@gmail.com || Contact No: 01737784470 ||" , R.drawable.thewildrobot));

        //copy these five
        lstBook.add(new Book("Abdullah Al Hasib","2006331093","Nilavo Technologies Ltd.", "Batch: 2006  || Position: Sr. Software Engineer || Email: email2hasib@gmail.com || Contact No: 01610660166 ||"  , R.drawable.hediedwith));
        lstBook.add(new Book( "Abdullah Aziz Sharfuddin  Shakkhor","2014331011","No Recent Company Found", "Batch: 2014  || Position: N/A || Email: abdullahshakkhor@gmail.com || Contact No: 01521111304 ||" , R.drawable.mariasemples));
        lstBook.add(new Book( "Abdullahil Baki Md. Ruhunnabi","2002331084","Bangladesh Water Development Board", "Batch: 2002 || Position: Programmer || Email: sat.sust@gmail.com || Contact No: 01911130473 ||" , R.drawable.themartian));
        lstBook.add(new Book(
                "Abu Zahed Jony", "2004331028" , "KAZ Software Ltd" , "Batch: 2004 ||  Position: Senior Software Engineer || Email: jony.cse@gmail.com || Contact No: 01717674416 ||" , R.drawable.thevigitarian));
        lstBook.add(new Book(
                "Ahmad Rakib Uddin", "2003331008" ,"Paradoxspace Limited", "Batch: 2003 || Position: CEO || Email: rudro.reezo@gmail.com || Contact No: 01755898989 ||" , R.drawable.thewildrobot));


        lstBook.add(new Book("Md Rashed Azad Chowdhury","2006331079","The City Bank Limited","Batch: 2006  || Position: Senior Executive Officer || Email: rashed06cse@gmail.com || Contact No: 1717223104 ||", R.drawable.hediedwith));
        lstBook.add(new Book("Md Ruhul Amin","2006331015","Kona Software Lab Ltd","Batch: 2006  || Position: Senior Software Engineer || Email: email2ruhul@gmail.com || Contact No: 8801961032430 ||", R.drawable.mariasemples));
        lstBook.add(new Book("Md Ruhul Amin","","Alumni","Batch: &nbsp  || Position: &nbsp || Email: &nbsp || Contact No:  ||", R.drawable.themartian));
        lstBook.add(new Book("Md Sadek Ferdous","97310004","No Recent Company Found","Batch: 1997  || Position: N/A || Email: ripul.bd@gmail.com || Contact No: 1760253640 ||", R.drawable.thevigitarian));
        lstBook.add(new Book("Md Saiful Islam","Assistant Professor","Shahjalal University of Science &amp","Batch: 2005  || Position:  Technology || Email: saiful-cse@sust.edu || Contact No: 8801717960979 ||", R.drawable.hediedwith));
        lstBook.add(new Book("Md Saifur  Rahman","","Alumni","Batch: &nbsp  || Position: &nbsp || Email: &nbsp || Contact No:  ||", R.drawable.thewildrobot));
        lstBook.add(new Book("Md Saifur Rahman","98310041","No Recent Company Found","Batch: 1998  || Position: N/A || Email: titu41@gmail.com || Contact No: 1716468450 ||", R.drawable.themartian));
        lstBook.add(new Book("Md Saifuzzaman","96310040","Opus Technology Ltd","Batch: 1996  || Position: AGM || Email: saifuzzaman@gmail.com || Contact No: 1755225511 ||", R.drawable.mariasemples));
        lstBook.add(new Book("MD SHAFIQUL ISLAM","99330012","Intrigue IT solutions","Batch: 1999  || Position: Head of Software Development || Email: shafiqswh@gmail.com || Contact No: 1712088033 ||", R.drawable.hediedwith));
        lstBook.add(new Book("Md Shiam Shabbir","2006331077","GA Technologies","Batch: 2006  || Position: Software Enginner || Email: sabbirshiam@gmail.com || Contact No: 817031339854 ||", R.drawable.mariasemples));
        lstBook.add(new Book("Md Sulayman","2011331041","Monstar Lab Bangladesh Ltd","Batch: 2011  || Position: Software Engineer (iOS) || Email: sulaiman.sust@gmail.com || Contact No: 1716502426 ||", R.drawable.themartian));
        lstBook.add(new Book("MD Tanveer Islam","2012331007","Reve Systems","Batch: 2012  || Position: Software Engineer || Email: tanveer.preom@gmail.com || Contact No: 1717749951 ||", R.drawable.thevigitarian));
        lstBook.add(new Book("MD TOWHIDUL ISLAM","2000330008","Chevron Bangladesh","Batch: 2000  || Position: Project Support Planner || Email: paurag008@yahoo.com || Contact No: 1926672016 ||", R.drawable.hediedwith));
        lstBook.add(new Book("Md Uddin","2004331066","No Recent Company Found","Batch: 2004  || Position: N/A || Email: kamal.csesust@gmail.com || Contact No: 8801823033406 ||", R.drawable.thewildrobot));
        lstBook.add(new Book("Md. Abdur Rahim Khan"," ICT","Modhumoti Bank Limited","Batch: 1997  || Position: AVP || Email: khan.rahim@gmail.com || Contact No: 1712876460 ||", R.drawable.themartian));
        lstBook.add(new Book("Md. Abdus  Salam","","Alumni","Batch: &nbsp  || Position: &nbsp || Email: &nbsp || Contact No:  ||", R.drawable.mariasemples));
        lstBook.add(new Book("MD. ABU TALHA","2012331008","Widespace(Vivacom Solutions Ltd.)","Batch: 2012  || Position: Software Engineer || Email: talhaqc@gmail.com || Contact No: 1967402131 ||", R.drawable.hediedwith));
        lstBook.add(new Book("Md. Ahsan Kabir (Shohagh)","2011331003","BJIT Limited","Batch: 2011  || Position: Software Engineer || Email: ahsankabircse@gmail.com || Contact No: 1722090524 ||", R.drawable.mariasemples));
        lstBook.add(new Book("Md. Al-Amin","2011331055","Therap (BD) Ltd.","Batch: 2011  || Position: Software Engineer (Development) || Email: alaminbbsc@gmail.com || Contact No: 8801711389230 ||", R.drawable.themartian));
        lstBook.add(new Book("Md. Anisur Rahman","Associate Specialist","Center For Environmental &amp","Batch: 2002  || Position:  Geographic Information Services (CEGIS) || Email: anis112@gmail.com || Contact No: 1911613096 ||", R.drawable.mariasemples));
        lstBook.add(new Book("Md. Anwar Hossain","2013331035","No Recent Company Found","Batch: 2013  || Position: N/A || Email: anwarhossain221095@gmail.com || Contact No: 1943665938 ||", R.drawable.hediedwith));
        lstBook.add(new Book("Md. Arifur Rahman","2000330092","No Recent Company Found","Batch: 2000  || Position: N/A || Email: arif2ksust@yahoo.com || Contact No: 1730318177 ||", R.drawable.thewildrobot));
        lstBook.add(new Book("Md. Ashraf Chowdhury","2001331120","Ericsson","Batch: 2001  || Position: Subject Matter Expert || Email: ashraf783@gmail.com || Contact No: ±8801678102232 ||", R.drawable.themartian));
        lstBook.add(new Book("Md. Asifuzzaman","2010331034","No Recent Company Found","Batch: 2010  || Position: N/A || Email: hridoy.sust@yahoo.com || Contact No: 1723800276 ||", R.drawable.thevigitarian));
        lstBook.add(new Book("MD. ATIKUR  RAHMAN","2002331122","Sonali Bank Limited","Batch: 2002  || Position: Programmer || Email: atik.hasan@gmail.com || Contact No: 8801717531758 ||", R.drawable.hediedwith));
        lstBook.add(new Book("MD. Fahad Hasan","","Alumni","Batch: &nbsp  || Position: &nbsp || Email: &nbsp || Contact No:  ||", R.drawable.mariasemples));
        lstBook.add(new Book("Md. Fakhrul Islam"," IT Division","SBAC Bank Ltd.","Batch: 1995  || Position: First Vice President || Email: suzan7sust@gmail.com || Contact No: 1787693969 ||", R.drawable.themartian));
        lstBook.add(new Book("Md. Hamimul Hasan Chowdhury","","Alumni","Batch: &nbsp  || Position: &nbsp || Email: &nbsp || Contact No:  ||", R.drawable.mariasemples));
        lstBook.add(new Book("Md. Hasauzzaman Siddique"," IT","IDLC Finance Limited","Batch: 2001  || Position: Manager || Email: faruq.sf@gmail.com || Contact No: 1712083344 ||", R.drawable.hediedwith));
        lstBook.add(new Book("Md. Khademul Islam Molla","92310006","No Recent Company Found","Batch: 1992  || Position: N/A || Email: khademul.ru@gmail.com || Contact No: 1727786600 ||", R.drawable.thewildrobot));
        lstBook.add(new Book("Md. Khairullah Gaurab","2011331063","No Recent Company Found","Batch: 2011  || Position: N/A || Email: mkgaurabsarkar@gmail.com || Contact No: 8801750503380 ||", R.drawable.themartian));
        lstBook.add(new Book("Md. Mamun-ur Rashid","","Alumni","Batch: &nbsp  || Position: &nbsp || Email: &nbsp || Contact No:  ||", R.drawable.thevigitarian));
        lstBook.add(new Book("Md. Masud Rana","2004331011","Nascenia","Batch: 2004  || Position: Principal Software Engineer || Email: masudcsesust04@gmail.com || Contact No: 1912107357 ||", R.drawable.hediedwith));
        lstBook.add(new Book("MD. MEHEDI  HASAN","","Alumni","Batch: &nbsp  || Position: &nbsp || Email: &nbsp || Contact No:  ||", R.drawable.mariasemples));
        lstBook.add(new Book("MD. Ozayer Islam","2013331062","No Recent Company Found","Batch: 2013  || Position: N/A || Email: ozayerislam@gmail.com || Contact No: 1521236266 ||", R.drawable.themartian));
        lstBook.add(new Book("Md. Rahman","2001331003","No Recent Company Found","Batch: 2001  || Position: N/A || Email: tushar.sust@gmail.com || Contact No: 1776198791 ||", R.drawable.mariasemples));
        lstBook.add(new Book("MD. Sazedul Karim","2005331026","Codetrio","Batch: 2005  || Position: Sr. Software Engineer || Email: sazedul.cse@gmail.com || Contact No: 1722385918 ||", R.drawable.hediedwith));
        lstBook.add(new Book("Md. Shafiqul Haq","Manager","Bakhrabad Gas Distribution Company Limited","Batch: 1997  || Position:  Cumilla. || Email: shafiqhaq@gmail.com || Contact No: 1719048058 ||", R.drawable.thewildrobot));
        lstBook.add(new Book("Md. Shafiuzzaman Rajib","99330048","Nuspay","Batch: 1999  || Position: Project Manager || Email: rajib.shafiuzzaman@gmail.com || Contact No: 8801914239534 ||", R.drawable.themartian));
        lstBook.add(new Book("Md. Shahidul Islam","","Alumni","Batch: &nbsp  || Position: &nbsp || Email: &nbsp || Contact No:  ||", R.drawable.thevigitarian));
        lstBook.add(new Book("Md. Shams Arafat","2000330080","Dutch-Bangla Bank Limited","Batch: 2000  || Position: Assistant Vice President || Email: shamsarafat@gmail.com || Contact No: 1717022020 ||", R.drawable.hediedwith));
        lstBook.add(new Book("Md. Yeasir Arafat Bhuiyan","2000330101","No Recent Company Found","Batch: 2000  || Position: N/A || Email: mdyeasir@gmail.com || Contact No: 1882670998 ||", R.drawable.mariasemples));
        lstBook.add(new Book("Md. Yusuf Ali","","Alumni","Batch: &nbsp  || Position: &nbsp || Email: &nbsp || Contact No:  ||", R.drawable.themartian));
        lstBook.add(new Book("Md.Afjal Hossain","2010331067","No Recent Company Found","Batch: 2010  || Position: N/A || Email: afjal.sm19@gmail.com || Contact No: 8801710337220 ||", R.drawable.mariasemples));
        lstBook.add(new Book("Md.Shakawat  Hossain","98310051","Dhaka Electric Supply Company Limited(DESCO)","Batch: 1998  || Position: Sub-Divisional Engineer || Email: shakawatcse@gmail.com || Contact No: 1711983353 ||", R.drawable.hediedwith));
        lstBook.add(new Book("Md.Zahid Hasan","2004331023","No Recent Company Found","Batch: 2004  || Position: N/A || Email: sajal023@gmail.com || Contact No: 1718098852 ||", R.drawable.thewildrobot));
        lstBook.add(new Book("Mehedi Hasan","2009331062","No Recent Company Found","Batch: 2009  || Position: N/A || Email: herocksust@gmail.com || Contact No: 1618099177 ||", R.drawable.themartian));
        lstBook.add(new Book("Mezanul Hoque Chy","2011331046","Therap BD Ltd","Batch: 2011  || Position: Software Engineer || Email: mezanul.hoque.chy@gmail.com || Contact No: 1818425053 ||", R.drawable.thevigitarian));
        lstBook.add(new Book("Miraz Mahmud","2005331029","No Recent Company Found","Batch: 2005  || Position: N/A || Email: miraz029@gmail.com || Contact No: 1747317895 ||", R.drawable.hediedwith));
        lstBook.add(new Book("Mithila Mishu","2005331030","Kona Software Lab","Batch: 2005  || Position: Sr. Software Engineer || Email: mithila.mishu@gmail.com || Contact No: 1715279477 ||", R.drawable.mariasemples));
        lstBook.add(new Book("Mohammad  Muktadear Mia","95310033","No Recent Company Found","Batch: 1995  || Position: N/A || Email: mukul.cse@gmail.com || Contact No: 8801715511656 ||", R.drawable.themartian));
        lstBook.add(new Book("Mohammad Abu Sayeem Chowdhury","2004331048","Wipro Limited","Batch: 2004  || Position: Project Engineer || Email: ocp.sayeem@gmail.com || Contact No: 1766668878 ||", R.drawable.mariasemples));
        lstBook.add(new Book("Mohammad Abu Yousuf","95310016","No Recent Company Found","Batch: 1995  || Position: N/A || Email: yousuf@juniv.edu || Contact No: 1711469636 ||", R.drawable.hediedwith));
        lstBook.add(new Book("Mohammad CISA","&nbsp","sust_khairul@yahoo.com","Batch: CEH  || Position: Alumni || Email:  || Contact No: &nbsp ||", R.drawable.thewildrobot));
        lstBook.add(new Book("Mohammad Musa","94310035","Dekko Group","Batch: 1995  || Position: Head of ICT || Email: mdmusa@gmail.com || Contact No: 1841085035 ||", R.drawable.themartian));
        lstBook.add(new Book("Mohammad Nur Uddin","2011331025","No Recent Company Found","Batch: 2011  || Position: N/A || Email: nur.bd.11@gmail.com || Contact No: 1822480684 ||", R.drawable.thevigitarian));
        // lstBook.add(new Book("Mohammad Nurul Afsar","2003331087","Bangladesh Power Development Board","Batch: 2003  || Position: Deputy Director || Email: nurul_afsar_shohel@yahoo.com || Contact No: 1673706225 ||", R.drawable.hediedwith));
        lstBook.add(new Book("Mohammad Nurul Islam","96310023","Deligram Technology Ltd.","Batch: 1996  || Position: CTO || Email: mnislamshihan@gmail.com || Contact No: 8801713375785 ||", R.drawable.mariasemples));
        lstBook.add(new Book("MOHAMMAD OMAR FARUK","2000330001","No Recent Company Found","Batch: 2000  || Position: N/A || Email: mohon.sust@gmail.com || Contact No: 1722146396 ||", R.drawable.themartian));
        lstBook.add(new Book("Mohammad Saiful Islam","98310001","No Recent Company Found","Batch: 1998  || Position: N/A || Email: mohammad.s.islam@ryerson.ca || Contact No: 16477800845 ||", R.drawable.mariasemples));
        lstBook.add(new Book("Mohammad Sazzadul Hoque","2006331001","No Recent Company Found","Batch: 2006  || Position: N/A || Email: sazzad.cse.sust@gmail.com || Contact No: 8801717746263 ||", R.drawable.hediedwith));
        lstBook.add(new Book("Mohammed Hasanul Awal Maruf","2005331077","No Recent Company Found","Batch: 2005  || Position: N/A || Email: hamaruf@gmail.com || Contact No: 1723409534 ||", R.drawable.thewildrobot));
        lstBook.add(new Book("Mohammed Helal Uddin","2000330097","REVE Group","Batch: 2000  || Position: AGM || Email: helalcse2k@gmail.com || Contact No: 8801814655946 ||", R.drawable.themartian));
        lstBook.add(new Book("Mohammed Jahirul Islam","92310022","Shahjalal University of Science and Technology","Batch: 1992  || Position: Professor || Email: jahir75bd@gmail.com || Contact No: 8801770348185 ||", R.drawable.thevigitarian));
        lstBook.add(new Book("Mohammed Shamsul Alam","92310026","International Islamic University Chittagong","Batch: 1992  || Position: Professor || Email: alam_cse@yahoo.com || Contact No: 1711941680 ||", R.drawable.mariasemples));
        lstBook.add(new Book("Monish Chakrabortty","2003331053","No Recent Company Found","Batch: 2003  || Position: N/A || Email: monish.sust@gmail.com || Contact No: 1728854159 ||", R.drawable.hediedwith));
        lstBook.add(new Book("Monoj Das","","Alumni","Batch: &nbsp  || Position: &nbsp || Email: &nbsp || Contact No:  ||", R.drawable.mariasemples));
        lstBook.add(new Book("Moshhud Ahmed","2003331028","No Recent Company Found","Batch: 2003  || Position: N/A || Email: moshhudahmed@gmail.com || Contact No: 1911612498 ||", R.drawable.themartian));
        lstBook.add(new Book("MOSTOFA SHAWKAT ARAFAT"," Transport","Ericsson Malaysia SDN","Batch: 2001  || Position: Manager – RAN &amp || Email: arafat16@gmail.com || Contact No: 60143297234 ||", R.drawable.thewildrobot));
        lstBook.add(new Book("Mrinal Chandra Sarker","2002331012","No Recent Company Found","Batch: 2002  || Position: N/A || Email: mrinal_sust_0212@yahoo.com || Contact No: 1916634001 ||", R.drawable.hediedwith));
        lstBook.add(new Book("Mst. Mahfuja Akter","2003331113","No Recent Company Found","Batch: 2003  || Position: N/A || Email: ruby.sust69@gmail.com || Contact No: 4915168733156 ||", R.drawable.thevigitarian));
        lstBook.add(new Book("Muhammad Amanat Mowla","","Alumni","Batch: &nbsp  || Position: &nbsp || Email: &nbsp || Contact No:  ||", R.drawable.themartian));
        lstBook.add(new Book("Muhammad Atiqur Rahman","97310033","No Recent Company Found","Batch: 1997  || Position: N/A || Email: atik33@gmail.com || Contact No: 8801678102235 ||", R.drawable.mariasemples));
        lstBook.add(new Book("Muhammad Fokhrul Islam Bhuiyan","97310027","International Islamic University Chittagong","Batch: 1997  || Position: Deputy Director || Email: ronnycse@gmail.com || Contact No: 1713364810 ||", R.drawable.hediedwith));
        lstBook.add(new Book("Muhammad Hasibur Rashid Chayon","Associate Professor","IUBAT","Batch: 2001  || Position:  Dhaka || Email: hchayon@gmail.com || Contact No: 1912643723 ||", R.drawable.mariasemples));
        lstBook.add(new Book("Muhammad Islam","","Alumni","Batch: &nbsp  || Position: &nbsp || Email: &nbsp || Contact No:  ||", R.drawable.themartian));
        lstBook.add(new Book("Muhammad Mahedi Hassan","99330017","No Recent Company Found","Batch: 1999  || Position: N/A || Email: mailto.mahedi@gmail.com || Contact No: 1914239553 ||", R.drawable.thewildrobot));
        lstBook.add(new Book("Muhammed Nyeem Hassan","2003331020","Brain Craft Limited","Batch: 2003  || Position: CEO || Email: nyeem@braincraftapps.com || Contact No: 8801739207012 ||", R.drawable.hediedwith));
        lstBook.add(new Book("N.M. Rakibul Hasan","2003331051","No Recent Company Found","Batch: 2003  || Position: N/A || Email: nrusho@gmail.com || Contact No: 1617415700 ||", R.drawable.thevigitarian));
        lstBook.add(new Book("Nabil Ahmed Lipon","98310022","Progoti Systems Ltd.","Batch: 1998  || Position: VP || Email: ahmed.lipon@gmail.com || Contact No: 1711484383 ||", R.drawable.themartian));
        lstBook.add(new Book("Nadia Akbar Tumpa","2006331066","Mutual Trust Bank Ltd","Batch: 2006  || Position: Officer || Email: sust.nadia@gmail.com || Contact No: 8801726742939 ||", R.drawable.mariasemples));
        lstBook.add(new Book("Nafis Ahmed","2009331042","No Recent Company Found","Batch: 2009  || Position: N/A || Email: nafubd@gmail.com || Contact No: 1670094976 ||", R.drawable.hediedwith));
        lstBook.add(new Book("Nafisa Shams","2005331020","No Recent Company Found","Batch: 2005  || Position: N/A || Email: nafisashams29@gmail.com || Contact No: 1720405020 ||", R.drawable.mariasemples));
        lstBook.add(new Book("Nakul chandra Saha","2010331008","No Recent Company Found","Batch: 2010  || Position: N/A || Email: sahasust.cse19@gmail.com || Contact No: 1927918283 ||", R.drawable.themartian));
        lstBook.add(new Book("Nazia Hasin","2001331076","No Recent Company Found","Batch: 2001  || Position: N/A || Email: ishi_sust@yahoo.com || Contact No: 1719220425 ||", R.drawable.thevigitarian));
        lstBook.add(new Book("Nazmul Huda","92310033","Midland Bank","Batch: 1992  || Position: CTO || Email: nzhuda@gmail.com || Contact No: 1730343748 ||", R.drawable.hediedwith));
        lstBook.add(new Book("Nazmul Quader  Zinnuree","2001331103","No Recent Company Found","Batch: 2001  || Position: N/A || Email: zinnuree@gmail.com || Contact No: 1717133886 ||", R.drawable.thewildrobot));
        lstBook.add(new Book("Nikson Kanti Paul","2005331040","No Recent Company Found","Batch: 2005  || Position: N/A || Email: nikson.sust@gmail.com || Contact No: 491748454788 ||", R.drawable.themartian));
        lstBook.add(new Book("Nirmalendu Das","2000330078","No Recent Company Found","Batch: 2000  || Position: N/A || Email: nirmal_cse78@yahoo.com || Contact No: 1814655936 ||", R.drawable.thevigitarian));
        lstBook.add(new Book("Nishat Tasnim Ahmed Meem","Lecturer","Metropolitan University","Batch: 2013  || Position:  Sylhet || Email: meemnishat@gmail.com || Contact No: 1681423090 ||", R.drawable.hediedwith));
        lstBook.add(new Book("Nur Hossen","2002331073","Sonali Bank Limited","Batch: 2002  || Position: Programmer || Email: riponnur@gmail.com || Contact No: 01717-497745 ||", R.drawable.mariasemples));
        lstBook.add(new Book("Piplu Barua","","Alumni","Batch: &nbsp  || Position: &nbsp || Email: &nbsp || Contact No:  ||", R.drawable.themartian));
        lstBook.add(new Book("Prioranjan Chowdhury"," MIS","Thermax Group Ltd.","Batch: 2003  || Position: Head of IT &amp || Email: sumon.sustcse@gmail.com || Contact No: 1787694935 ||", R.drawable.mariasemples));
        lstBook.add(new Book("Pritam Jyoti Ray","2004331040","FOX Rent A Car INC","Batch: 2004  || Position: Sr. Software Engineer || Email: pritam.sust@gmail.com || Contact No: 1724691818 ||", R.drawable.hediedwith));
        lstBook.add(new Book("Raahsalah Salak"," Director","Salah Software Solution","Batch: 2004  || Position: Founder &amp || Email: raahsalah@gmail.com || Contact No: 1717569992 ||", R.drawable.thewildrobot));
        lstBook.add(new Book("Rabby Khan","2009331010","No Recent Company Found","Batch: 2009  || Position: N/A || Email: rabby.cse@gmail.com || Contact No: 1823636318 ||", R.drawable.themartian));
        lstBook.add(new Book("Raihan Hossain","98310060","No Recent Company Found","Batch: 1998  || Position: N/A || Email: raihan.hossain@hotmail.com || Contact No: 1814665929 ||", R.drawable.thevigitarian));
        lstBook.add(new Book("Rajib Bhowmik","IT Specialist (System Analyst)","Center for Environmental &amp","Batch: 2004  || Position:  Geographical Information Services (A public Trust under the Ministry of Water Resources) || Email: rajib.cse37@gmail.com || Contact No: 1718821740 ||", R.drawable.hediedwith));
        lstBook.add(new Book("Rajib Chandra Das","","Alumni","Batch: &nbsp  || Position: &nbsp || Email: &nbsp || Contact No:  ||", R.drawable.mariasemples));
        lstBook.add(new Book("Rajib Sen","2003331040","No Recent Company Found","Batch: 2003  || Position: N/A || Email: senrajib@ymail.com || Contact No: 1717130038 ||", R.drawable.themartian));
        lstBook.add(new Book("Rakib Jahan Khan","2005331075","Software People","Batch: 2005  || Position: Sr. System Developer || Email: rakib.cse.sust@gmail.com || Contact No: 1672208631 ||", R.drawable.mariasemples));
        lstBook.add(new Book("Raman Karmakar","2006331092","No Recent Company Found","Batch: 2006  || Position: N/A || Email: raman.sust@gmail.com || Contact No: 1710152362 ||", R.drawable.hediedwith));
        lstBook.add(new Book("Rana Asif Bin Hamid","2000330018","No Recent Company Found","Batch: 2000  || Position: N/A || Email: hemel018@gmail.com || Contact No: 1716250556 ||", R.drawable.thewildrobot));
        lstBook.add(new Book("Ranit  Debnath Akash","2012331043","No Recent Company Found","Batch: 2012  || Position: N/A || Email: ranitid12@gmail.com || Contact No: 1682047902 ||", R.drawable.themartian));
        lstBook.add(new Book("Rasheda Sultana","","Alumni","Batch: &nbsp  || Position: &nbsp || Email: &nbsp || Contact No:  ||", R.drawable.thevigitarian));
        lstBook.add(new Book("Rashedul Hossain Khan","2002331001","No Recent Company Found","Batch: 2002  || Position: N/A || Email: rhkhan.rubel@gmail.com || Contact No: 1717281271 ||", R.drawable.mariasemples));
        lstBook.add(new Book("Rishmita Tasmim","2010331015","No Recent Company Found","Batch: 2010  || Position: N/A || Email: rishmita.sust@gmail.com || Contact No: 1521569505 ||", R.drawable.hediedwith));
        lstBook.add(new Book("Riyad  Bin Zaman","","Alumni","Batch: &nbsp  || Position: &nbsp || Email: &nbsp || Contact No:  ||", R.drawable.mariasemples));
        lstBook.add(new Book("Rubaiyyaat Aakbar","96310004","No Recent Company Found","Batch: 1996  || Position: N/A || Email: rubaiyyaat@yahoo.com || Contact No: 6586801285 ||", R.drawable.themartian));
        lstBook.add(new Book("Rukba Iffat","98310024","No Recent Company Found","Batch: 1998  || Position: N/A || Email: iffat.rukba@gmail.com || Contact No: 1711271184 ||", R.drawable.thewildrobot));
        lstBook.add(new Book("S M Didarul Abedin"," IT Division","Midland Bank Limited","Batch: 2000  || Position: First Assistant Vice President || Email: didar.sust@gmail.com || Contact No: 1976672070 ||", R.drawable.hediedwith));
        lstBook.add(new Book("S M Mahmudul Hasan","2003331061","No Recent Company Found","Batch: 2003  || Position: N/A || Email: shohan.cse.sust@gmail.com || Contact No: 1739886722 ||", R.drawable.thevigitarian));
        lstBook.add(new Book("S. M. Ariful Islam","2010331031","No Recent Company Found","Batch: 2010  || Position: N/A || Email: tusher91@gmail.com || Contact No: 1681313153 ||", R.drawable.themartian));
        lstBook.add(new Book("S. M. Nusayer Hassan","2006331048","No Recent Company Found","Batch: 2006  || Position: N/A || Email: ayon.cse.sust@gmail.com || Contact No: 8801723301922 ||", R.drawable.mariasemples));
        lstBook.add(new Book("S. M. Shaon","2006331063","No Recent Company Found","Batch: 2006  || Position: N/A || Email: shaon63@gmail.com || Contact No: 1717888891 ||", R.drawable.hediedwith));
        lstBook.add(new Book("Sadia Sultana","2002331025","No Recent Company Found","Batch: 2002  || Position: N/A || Email: sadia.sultana02@yahoo.com || Contact No: 1911089612 ||", R.drawable.mariasemples));
        lstBook.add(new Book("Sahidul Hassan","2004331081","No Recent Company Found","Batch: 2004  || Position: N/A || Email: alrazon@gmail.com || Contact No: 1717897213 ||", R.drawable.themartian));
        lstBook.add(new Book("Saiduzzaman Majumder","97310036","Siam City Cement Bangladesh","Batch: 1997  || Position: Head of IT || Email: saiduzzaman.majumder@gmail.com || Contact No: 1711596988 ||", R.drawable.thewildrobot));
        lstBook.add(new Book("Sakhawat Hossain Saimon","2011331004","No Recent Company Found","Batch: 2011  || Position: N/A || Email: saimon.sust@gmail.com || Contact No: 8801727412525 ||", R.drawable.hediedwith));
        lstBook.add(new Book("Sakibul Mowla","2011331017","Bloomberg LP","Batch: 2011  || Position: Software Engineer || Email: sakibulmowla@gmail.com || Contact No: 447340910991 ||", R.drawable.thevigitarian));
        lstBook.add(new Book("Salman Wahed","2008331041","TigerIT Bangladesh Limited","Batch: 2008  || Position: Software Engineer || Email: swahed@yahoo.com || Contact No: 1717337516 ||", R.drawable.themartian));
        lstBook.add(new Book("Sanat Pal Chowdhury","98310027","No Recent Company Found","Batch: 1998  || Position: N/A || Email: spctoday@gmail.com || Contact No: 8801711501023 ||", R.drawable.mariasemples));
        lstBook.add(new Book("Sanjoy Kumer Deb","2006331082","TenderEasy AB","Batch: 2006  || Position: System Developer || Email: sanjoyd.cse@gmail.com || Contact No: 1719149840 ||", R.drawable.hediedwith));
        lstBook.add(new Book("Saurav Kumar Saha","2007331004","Innovative Solutions","Batch: 2007  || Position: Sr. Software Engineer || Email: sks.sauravs@yahoo.com || Contact No: 1675728972 ||", R.drawable.mariasemples));
        lstBook.add(new Book("Sayed Mohammad Imtiaz Murshed","96310036","No Recent Company Found","Batch: 1996  || Position: N/A || Email: imurshed@gmail.com || Contact No: 8801714039577 ||", R.drawable.themartian));
        lstBook.add(new Book("Shafin Mahmud","2011331001","Therap BD Ltd.","Batch: 2011  || Position: Software Engineer || Email: shafin.mahmud@gmail.com || Contact No: 1717364467 ||", R.drawable.thewildrobot));
        lstBook.add(new Book("Shafiul Hasan","","Alumni","Batch: &nbsp  || Position: &nbsp || Email: &nbsp || Contact No:  ||", R.drawable.hediedwith));
        lstBook.add(new Book("Shah Minul Amin","2000330055","No Recent Company Found","Batch: 2000  || Position: N/A || Email: sajib.iosdev@gmail.com || Contact No: 1911720302 ||", R.drawable.thevigitarian));
        lstBook.add(new Book("Shailen Chandra Das Shuvo","2004331022","NEWTEL TECHNOLOGIES","Batch: 2004  || Position: Managing Director || Email: shuvosust@gmail.com || Contact No: 1710892398 ||", R.drawable.themartian));
        lstBook.add(new Book("Shakhawat  Ami","","Alumni","Batch: &nbsp  || Position: &nbsp || Email: &nbsp || Contact No:  ||", R.drawable.mariasemples));
        lstBook.add(new Book("Shamim Ehsan","2012331035","Kona Software Lab Ltd.","Batch: 2012  || Position: Jr Engineer || Email: ehsanhrid@gmail.com || Contact No: 1816835476 ||", R.drawable.hediedwith));
        lstBook.add(new Book("Shamseer Md . Saiful Aziz","99330023","Grameenphone Ltd.","Batch: 1999  || Position: Sr. Lead Engineer || Email: shamseerbd@yahoo.com || Contact No: 8801711504900 ||", R.drawable.mariasemples));
        lstBook.add(new Book("Shazadur Rahman Khan Tapu","2004331071","No Recent Company Found","Batch: 2004  || Position: N/A || Email: tapucse@gmail.com || Contact No: 1727209086 ||", R.drawable.thevigitarian));
        lstBook.add(new Book("Sheikh Nabil Mohammad","2006331004","No Recent Company Found","Batch: 2006  || Position: N/A || Email: sknabil@gmail.com || Contact No: +1(407)9787936 ||", R.drawable.themartian));
        lstBook.add(new Book("Shibbir Ahmed Asif","2004331024","No Recent Company Found","Batch: 2004  || Position: N/A || Email: shibbirasif@gmail.com || Contact No: 1717305175 ||", R.drawable.thewildrobot));
        lstBook.add(new Book("Shoaib Alam","2013331064","No Recent Company Found","Batch: 2013  || Position: N/A || Email: shoaibalam.cse@gmail.com || Contact No: 1738353774 ||", R.drawable.hediedwith));
        lstBook.add(new Book("Shuhan Mirza","2014331037","InfoSapex Limted","Batch: 2014  || Position: Software Engineer || Email: shuhan.mirza@gmail.com || Contact No: 1621416121 ||", R.drawable.mariasemples));
        lstBook.add(new Book("Siham Sharif","2009331049","Therap BD LTD","Batch: 2009  || Position: Senior System Administrator || Email: siham_sharif@yahoo.com || Contact No: 8801672989395 ||", R.drawable.themartian));
        lstBook.add(new Book("Sourav Kumar  Ghosh","2005331067","No Recent Company Found","Batch: 2005  || Position: N/A || Email: sourav.sust05@gmail.com || Contact No: 1717335485 ||", R.drawable.mariasemples));
        lstBook.add(new Book("Sourav Sarker","2014331039","No Recent Company Found","Batch: 2014  || Position: N/A || Email: sourav39.csesust@gmail.com || Contact No: 1765651957 ||", R.drawable.hediedwith));
        lstBook.add(new Book("Subrata Nath","2011331031","No Recent Company Found","Batch: 2011  || Position: N/A || Email: shuvra.dev9@gmail.com || Contact No: 1829660540 ||", R.drawable.thevigitarian));
        lstBook.add(new Book("Summit Haque","2012331014","No Recent Company Found","Batch: 2012  || Position: N/A || Email: summit.haque@gmail.com || Contact No: 1677311158 ||", R.drawable.themartian));
        lstBook.add(new Book("Supran Jowti","2006331089","No Recent Company Found","Batch: 2006  || Position: N/A || Email: supron_09@yahoo.com || Contact No: 44488487 ||", R.drawable.thewildrobot));
        lstBook.add(new Book("Syed Ahmed Salimuddin Sultan","92310040","No Recent Company Found","Batch: 1992  || Position: N/A || Email: salimuddinsultan@gmail.com || Contact No: 1929461774 ||", R.drawable.hediedwith));
        lstBook.add(new Book("Syed Hasnayeen","","Alumni","Batch: &nbsp  || Position: &nbsp || Email: &nbsp || Contact No:  ||", R.drawable.mariasemples));
        lstBook.add(new Book("Syed Mehedi Hasan Nirob","","Alumni","Batch: &nbsp  || Position: &nbsp || Email: &nbsp || Contact No:  ||", R.drawable.themartian));
        lstBook.add(new Book("Syed Rezwanul Haque","2008331006","No Recent Company Found","Batch: 2008  || Position: N/A || Email: rubelreza@gmail.com || Contact No: 1717141905 ||", R.drawable.mariasemples));
        lstBook.add(new Book("Tahmim Ahmed Shibli","2005331049","No Recent Company Found","Batch: 2005  || Position: N/A || Email: shibli05@gmail.com || Contact No: 1914546080 ||", R.drawable.hediedwith));
        lstBook.add(new Book("Talat Mursalin","2013331024","No Recent Company Found","Batch: 2013  || Position: N/A || Email: tanveer.2387@gmail.com || Contact No: 1671515865 ||", R.drawable.thevigitarian));
        lstBook.add(new Book("Tanvir Nihal","2013331054","No Recent Company Found","Batch: 2013  || Position: N/A || Email: tanviralam997@gmail.com || Contact No: 1786648359 ||", R.drawable.themartian));
        lstBook.add(new Book("Tariq M Nasim","2003331032","No Recent Company Found","Batch: 2003  || Position: N/A || Email: tariqmnasim@gmail.com || Contact No: 18043001839 ||", R.drawable.thewildrobot));
        lstBook.add(new Book("Taskin Khaleque","2008331050","Banglalink Digital Communications Ltd.","Batch: 2008  || Position: Application Engineer || Email: taskin0850@gmail.com || Contact No: 8801710352226 ||", R.drawable.hediedwith));
        lstBook.add(new Book("Tasnim Haider Chaudhury","2007331045","Bangladesh Computer Council","Batch: 2007  || Position: Information Technology Specialist || Email: tasnimhaiderchaudhury@gmail.com || Contact No: 1711084292 ||", R.drawable.mariasemples));
        lstBook.add(new Book("Tauhid Rahman","","Alumni","Batch: &nbsp  || Position: &nbsp || Email: &nbsp || Contact No:  ||", R.drawable.themartian));
        lstBook.add(new Book("Tofayel Ahammed Bhuiyan"," Information Technology","Bengal Hurricane Group","Batch: 1997  || Position: Manager || Email: tofayel.ahammed@gmail.com || Contact No: 1919093772 ||", R.drawable.mariasemples));
        lstBook.add(new Book("Tusar Majumder","2003331062","No Recent Company Found","Batch: 2003  || Position: N/A || Email: tusar1.cse.sust@gmail.com || Contact No: 880171753383 ||", R.drawable.hediedwith));
        lstBook.add(new Book("Wahidul  Islam Litton","2004331054","Rahim Group","Batch: 2004  || Position: IT Manager || Email: wahid.csesust@gmail.com || Contact No: 1710396285 ||", R.drawable.thevigitarian));
        lstBook.add(new Book("Y.M.Rezwanul Mannaf","2007331028","Windeln.de SE","Batch: 2007  || Position: Engineer || Email: ymrezwan@yahoo.com || Contact No: 4915210222466 ||", R.drawable.themartian));
        lstBook.add(new Book("Zahidul (Arzu)","99330018","No Recent Company Found","Batch: 1999  || Position: N/A || Email: zahidul.amin@gmail.com || Contact No: 1764111104 ||", R.drawable.thewildrobot));
        lstBook.add(new Book("Zahidur Rahman","","Alumni","Batch: &nbsp  || Position: &nbsp || Email: &nbsp || Contact No:  ||", R.drawable.hediedwith));
        lstBook.add(new Book("Zakia Sultana Ritu","","Alumni","Batch: &nbsp  || Position: &nbsp || Email: &nbsp || Contact No:  ||", R.drawable.mariasemples));
        lstBook.add(new Book("Zakir Hossain","2002331046","No Recent Company Found","Batch: 2002  || Position: N/A || Email: zakir01913@gmail.com || Contact No: 1913038998 ||", R.drawable.themartian));
        lstBook.add(new Book("Zulker Sohel Ahmed","92310011","No Recent Company Found","Batch: 1992  || Position: N/A || Email: zulker@braincabin.com || Contact No: 17789864346 ||", R.drawable.mariasemples));




        lstBook.add(new Book( "Ahmad Shabibul Hossain","2006331105","No Recent Company Found","Batch: 2006  || Position: N/A || Email: shabib.hossain@outlook.com || Contact No: 1670748746 ||" , R.drawable.hediedwith));
        lstBook.add(new Book( "Ahmmed Ektear Shakil","2003331075","No Recent Company Found","Batch: 2003  || Position: N/A || Email: usershakil@gmail.com || Contact No: 8801777678485 ||" , R.drawable.mariasemples));
        lstBook.add(new Book( "Ahsan Habib","96310037","No Recent Company Found","Batch: 1997  || Position: N/A || Email: ahsan.sust@gmail.com || Contact No: 61474591163 ||" , R.drawable.themartian));
        lstBook.add(new Book("Alauddin Riad","2004331036","Sonali Intellect Ptd Ltd","Batch: 2004  || Position: Consultant || Email: riad.cse13.sust@gmail.com || Contact No: 1747077714 ||"  , R.drawable.thevigitarian));
        lstBook.add(new Book( "Amio Pramanik","2004331016","No Recent Company Found","Batch: 2004  || Position: N/A || Email: amio04sust@gmail.com || Contact No: 1981995232 ||" , R.drawable.thewildrobot));

        lstBook.add(new Book( "Anup Biswas","2004331030","Ergo Ventures Pvt. Ltd","Batch: 2004  || Position: Program Manager || Email: anup04sust@gmail.com || Contact No: 1717819234 ||" , R.drawable.hediedwith));
        lstBook.add(new Book("Arafat Anwar Choudhury","2000330032","No Recent Company Found","Batch: 2000  || Position: N/A || Email: arafat.a.choudhury@gmail.com || Contact No: 66633730831 ||"  , R.drawable.mariasemples));
        lstBook.add(new Book("Arafat Habib Quraishi","2008331007","Leading University","Batch: 2008  || Position: Senior Lecturer || Email: ahq.cse@gmail.com || Contact No: 8801914487146 ||"  , R.drawable.themartian));
        lstBook.add(new Book(  "Ariful Islam","2014331045","No Recent Company Found","Batch: 2014  || Position: N/A || Email: arif.islam.j@gmail.com || Contact No: 1515665205 ||", R.drawable.thevigitarian));
        lstBook.add(new Book( "Arun Paul","2007331007","Bangladesh Government","Batch: 2007  || Position: Assistant Commissioner and Executive Magistrate || Email: aruncse2007007@gmail.com || Contact No: Dhaka ||" , R.drawable.thewildrobot));

        lstBook.add(new Book("Ashfak Ahmed","","Alumni","Batch: &nbsp  || Position: &nbsp || Email: &nbsp || Contact No:  ||", R.drawable.hediedwith));
        lstBook.add(new Book(  "Ashif Mohammad Iqbal","2006331009","Cefalo Bangladesh Ltd","Batch: 2006  || Position: Senior Software Engineer || Email: ashif.sust@gmail.com || Contact No: 8801717762903 ||", R.drawable.mariasemples));
        lstBook.add(new Book("Ashzabin Wadud","2011331064","No Recent Company Found","Batch: 2011  || Position: N/A || Email: ashzabinwadud@gmail.com || Contact No: 8801760151789 ||"  , R.drawable.themartian));
        lstBook.add(new Book( "Asieuzzaman Wasir","2006331059","BJIT Limited","Batch: 2006  || Position: Senior Software Engineer(Technical Lead) || Email: live.wasir@gmail.com || Contact No: 1736861305 ||" , R.drawable.thevigitarian));
        lstBook.add(new Book( "Asif Mohammed Samir","2007331005","No Recent Company Found","Batch: 2007  || Position: N/A || Email: asifsamir@gmail.com || Contact No: 1718168496 ||" , R.drawable.thewildrobot));

        lstBook.add(new Book( "Bappi Datta","2005331083","No Recent Company Found","Batch: 2005  || Position: N/A || Email: bappi.sust@gmail.com || Contact No: 1790444437 ||" , R.drawable.hediedwith));
        lstBook.add(new Book( "Benzamin Basher","","Alumni","Batch: &nbsp  || Position: &nbsp || Email: &nbsp || Contact No:  ||" , R.drawable.mariasemples));
        lstBook.add(new Book( "Bijan Paul","2006331011","No Recent Company Found","Batch: 2006  || Position: N/A || Email: bijancse@gmail.com || Contact No: 8801717221448 ||" , R.drawable.themartian));
        lstBook.add(new Book("Billal Mohammed Yasin Jisan","","Alumni","Batch: &nbsp  || Position: &nbsp || Email: &nbsp || Contact No:  ||"  , R.drawable.thevigitarian));
        lstBook.add(new Book( "Bishnu Pada Chanda","2002331067","No Recent Company Found","Batch: 2002  || Position: N/A || Email: gypsi.coder@gmail.com || Contact No: 1722297696 ||" , R.drawable.thewildrobot));

        lstBook.add(new Book( "Biswajit Debnath","2011331009","Kinetik Care","Batch: 2011  || Position: Junior Engineer || Email: biswajit.sust@gmail.com || Contact No: 8801937595521 ||" , R.drawable.hediedwith));
        lstBook.add(new Book( "Bokhtiar Mehedy","2006331057","No Recent Company Found","Batch: 2006  || Position: N/A || Email: mail.farsim@gmail.com || Contact No: 8801912155308 ||" , R.drawable.mariasemples));
        lstBook.add(new Book("Chinmoy Debnath","2005331012","No Recent Company Found","Batch: 2005  || Position: N/A || Email: chinmoy12@gmail.com || Contact No: 1715973237 ||"  , R.drawable.themartian));
        lstBook.add(new Book("Debashish Dasgupta","95310015","No Recent Company Found","Batch: 1995  || Position: N/A || Email: debu.ddg@gmail.com || Contact No: 1712910476 ||"  , R.drawable.thevigitarian));
        lstBook.add(new Book("DEBOTOSH DEY","2003331081","No Recent Company Found","Batch: 2003  || Position: N/A || Email: debotosh.dey.03@gmail.com || Contact No: 1711042374 ||" , R.drawable.thewildrobot));

        lstBook.add(new Book( "Dewan Mahmud Raihan","2010331036","TigerIT Bangladesh Limited","Batch: 2010  || Position: Software Engineer || Email: raihancse1992@gmail.com || Contact No: 1937951545 ||" , R.drawable.hediedwith));
        lstBook.add(new Book("Dipak Kumar Mondal","2004331063","No Recent Company Found","Batch: 2004  || Position: N/A || Email: dipak.cse2004@gmail.com || Contact No: 1911053978 ||"  , R.drawable.mariasemples));
        lstBook.add(new Book("Dipankar Roy","2007331018","TenderEasy AB","Batch: 2007  || Position: System Developer || Email: dipu.sust@gmail.com || Contact No: 1738140290 ||"  , R.drawable.themartian));
        lstBook.add(new Book( "Diptopol Dam","2008331042","No Recent Company Found","Batch: 2008  || Position: N/A || Email: diptodam@gmail.com || Contact No: 1673006306 ||" , R.drawable.thevigitarian));
        lstBook.add(new Book( "Dwijendra Chandra  Das","2002331114","Bangladesh University of Grants Commission","Batch: 2002  || Position: Programmer/System Engineer || Email: dwijen2002@gmail.com || Contact No: 1714911353 ||" , R.drawable.thewildrobot));

        lstBook.add(new Book("Engr. Md. Nazrul Islam","2002331117","No Recent Company Found","Batch: 2002  || Position: N/A || Email: nazrul.iba@gmail.com || Contact No: 1714118665 ||"  , R.drawable.hediedwith));
        lstBook.add(new Book( "Fahim Mohammad Chowdhury","2002331121","No Recent Company Found","Batch: 2002  || Position: N/A || Email: fahim.cse@gmail.com || Contact No: 1534616103 ||" , R.drawable.mariasemples));
        lstBook.add(new Book( "Fahim Rahman","2011331006","No Recent Company Found","Batch: 2011  || Position: N/A || Email: fahim.cse.sust@gmail.com || Contact No: 1683849913 ||" , R.drawable.themartian));
        lstBook.add(new Book( "Faisal Ahamed Khan","2006331069","Giga Tech Ltd","Batch: 2006  || Position: Head of Technology || Email: faisal.cse06@gmail.com || Contact No: 1719294629 ||" , R.drawable.thevigitarian));
        lstBook.add(new Book("Faisal Ahmed","2011331047","No Recent Company Found","Batch: 2011  || Position: N/A || Email: faisalrifat@gmail.com || Contact No: +65-84854206 ||"  , R.drawable.thewildrobot));

        lstBook.add(new Book("Fakrul Islam","97310017","Grameen Intel Social Business Ltd","Batch: 1997  || Position: General Manager || Email: fakruldsebd@gmail.com || Contact No: 1755524211 ||"  , R.drawable.hediedwith));
        lstBook.add(new Book("Farhad Kabir","2005331093","Bangladesh Police","Batch: 2005  || Position: Assistant Superintendent of Police || Email: mfksohail@gmail.com || Contact No: 8801779593715 ||"  , R.drawable.mariasemples));
        lstBook.add(new Book("Farjana Yeasmin Omee","2006331017","Therap (BD) Ltd","Batch: 2006  || Position: Senior Software Engineer || Email: fyomee@gmail.com || Contact No: 8801670423033 ||"  , R.drawable.themartian));
        lstBook.add(new Book( "Farzana Hoque","","Alumni","Batch: &nbsp  || Position: &nbsp || Email: &nbsp || Contact No:  ||" , R.drawable.thevigitarian));
        lstBook.add(new Book( "Ferdous Mohammed Shahriar","2002331049","Lifedata LLC","Batch: 2002  || Position: Principal Software Architect || Email: fmshahriar@gmail.com || Contact No: 8801911089511 ||" , R.drawable.thewildrobot));

        lstBook.add(new Book("Forkan Uddin","2003331083","Southeast Bank Limited","Batch: 2003  || Position: System Analyst || Email: e.forkan.sust@gmail.com || Contact No: 1715740550 ||"  , R.drawable.hediedwith));
        lstBook.add(new Book( "Foysal Ahmed Emon","Software Engineer","Infolytx","Batch: 2010  || Position:  Inc || Email: emon535@gmail.com || Contact No: 1520100178 ||" , R.drawable.mariasemples));
        lstBook.add(new Book("H M Mohiuddin","Captain (Programmer)","Signal Battalion","Batch: 2008  || Position:  Kuwait Armed Forces || Email: shamim08sust@gmail.com || Contact No: 95655629025 ||"  , R.drawable.themartian));
        lstBook.add(new Book( "Hasan Mahmud","99330008","Teletalk Bnagladesh Limited","Batch: 1999  || Position: Manager || Email: robinsust@gmail.com || Contact No: 1717930530 ||" , R.drawable.thevigitarian));
        lstBook.add(new Book( "Hasibus Saquib","2005331008","Bizmotion Ltd.","Batch: 2005  || Position: Senior Software Engineer || Email: saquib.hasibus@gmail.com || Contact No: 1737385700 ||" , R.drawable.thewildrobot));

        lstBook.add(new Book( "Haydary Mahfuz Ahmed","96310027","Banglalink Digital Communications Ltd","Batch: 1996  || Position: Senior Manager || Email: hmahfuz@gmail.com || Contact No: 1962424562 ||" , R.drawable.hediedwith));
        lstBook.add(new Book( "Himel Nag Rana","2000330023","No Recent Company Found","Batch: 2000  || Position: N/A || Email: hnrana@gmail.com || Contact No: 8801711664049 ||" , R.drawable.mariasemples));
        lstBook.add(new Book( "Hiro Mia","2003331006","IdeaScale","Batch: 2003  || Position: SQAE Team Leader || Email: hiromia006@gmail.com || Contact No: 1911613242 ||" , R.drawable.themartian));
        lstBook.add(new Book( "Imran Hasan Tarif","2005331096","No Recent Company Found","Batch: 2005  || Position: N/A || Email: ihtarif@gmail.com || Contact No: 1959609789 ||" , R.drawable.thevigitarian));
        lstBook.add(new Book( "Imran Zahid","2006331096","No Recent Company Found","Batch: 2006  || Position: N/A || Email: imrancsesust@gmail.com || Contact No: 1711084845 ||" , R.drawable.thewildrobot));

        lstBook.add(new Book( "Imranul Hoque","97310001","No Recent Company Found","Batch: 1997  || Position: N/A || Email: imranulh@gmail.com || Contact No: 1713257317 ||" , R.drawable.hediedwith));
        lstBook.add(new Book( "Imtiaz Ahmed","2004331094","GraphicPeople","Batch: 2004  || Position: QA Engineer || Email: imtiaz.cse04@gmail.com || Contact No: 1937785325 ||" , R.drawable.mariasemples));
        lstBook.add(new Book( "Janesar Azad","2002331058","No Recent Company Found","Batch: 2002  || Position: N/A || Email: kingshuk058@gmail.com || Contact No: 8801552417996 ||" , R.drawable.themartian));
        lstBook.add(new Book("Joy Prakash","2005331069","No Recent Company Found","Batch: 2005  || Position: N/A || Email: joycse18@yahoo.com || Contact No: 1711084619 ||"  , R.drawable.thevigitarian));
        lstBook.add(new Book( "Kamran Ahmed","2004331072","No Recent Company Found","Batch: 2004  || Position: N/A || Email: kamran.cse.sust@gmail.com || Contact No: 1911613464 ||" , R.drawable.thewildrobot));


        lstBook.add(new Book( "Kazi Salay Mahmud Dipta","2014331003","No Recent Company Found","Batch: 2014  || Position: N/A || Email: salaydipta@gmail.com || Contact No: 1836965285 ||" , R.drawable.hediedwith));
        lstBook.add(new Book( "Khaled Hasan Sazzad","2010331002","No Recent Company Found","Batch: 2010  || Position: N/A || Email: khaledhasansazzad@gmail.com || Contact No: 1680353509 ||" , R.drawable.mariasemples));
        lstBook.add(new Book( "Khondaker Refai Arafat","98310006","No Recent Company Found","Batch: 1998  || Position: N/A || Email: refai06@gmail.com || Contact No: 8801711285212 ||" , R.drawable.themartian));
        lstBook.add(new Book( "Marium-E- Jannat","2007331008","No Recent Company Found","Batch: 2007  || Position: N/A || Email: jannat-cse@sust.edu || Contact No: 1727354101 ||" , R.drawable.thevigitarian));
        lstBook.add(new Book( "Marjia Chowdhury","2006331014","GSK Bangladesh Ltd","Batch: 2006  || Position: Tech Operation Manager || Email: marjia_cse@yahoo.com || Contact No: 1711430490 ||", R.drawable.thewildrobot));

        lstBook.add(new Book( "Md  Ashaduzzaman","2001331019","National Board of Revenue","Batch: 2001  || Position: Deputy commissioner of taxes || Email: asadcse2003@yahoo.com || Contact No: 1731828551 ||" , R.drawable.hediedwith));
        lstBook.add(new Book( "Md Abu Shahriar Ratul","2010331016","SUST","Batch: 2010  || Position: Assistant Computer Programmer || Email: ratulcse10@gmail.com || Contact No: 1911225298 ||" , R.drawable.mariasemples));
        lstBook.add(new Book( "Md Abul Khayer","2000330117","No Recent Company Found","Batch: 2000  || Position: N/A || Email: khayer117@gmail.com || Contact No: 1911752340 ||" , R.drawable.themartian));
        lstBook.add(new Book( "MD AL-AMIN SARKER","2007331038","No Recent Company Found","Batch: 2007  || Position: N/A || Email: alamin.srk@gmail.com || Contact No: 8801717727399 ||" , R.drawable.thevigitarian));
        lstBook.add(new Book( "Md Aminur Rahman","2003331071","No Recent Company Found","Batch: 2003  || Position: N/A || Email: aminur.cse71@gmail.com || Contact No: 1716933583 ||" , R.drawable.thewildrobot));

        lstBook.add(new Book( "Md Ashraful Islam","2010331035","No Recent Company Found","Batch: 2010  || Position: N/A || Email: ashrafulcse.sust@gmail.com || Contact No: 8801628018167 ||" , R.drawable.hediedwith));
        lstBook.add(new Book(  "Md Borhan Uddin","2005331065","No Recent Company Found","Batch: 2005  || Position: N/A || Email: palash.borhan@gmail.com || Contact No: 6590358921 ||", R.drawable.mariasemples));
        lstBook.add(new Book( "Md Firoz","2003331046","Karatbars Software Solutions Ltd.","Batch: 2003  || Position: Lead Software Engineer || Email: firoz.cse.sust@gmail.com || Contact No: 8801734232826 ||" , R.drawable.themartian));
        lstBook.add(new Book( "Md Hasib Imam","","Alumni","Batch: &nbsp  || Position: &nbsp || Email: &nbsp || Contact No:  ||" , R.drawable.thevigitarian));
        lstBook.add(new Book( "Md Hoq","2008331018","Daffodil International University","Batch: 2008  || Position: Lecturer || Email: mnsalim.cse@gmail.com || Contact No: 8801918332093 ||" , R.drawable.thewildrobot));

        lstBook.add(new Book( "Md Khairul Islam Bhuiyan","2003331115","No Recent Company Found","Batch: 2003  || Position: N/A || Email: juwel.sust.cse@gmail.com || Contact No: 1718168254 ||" , R.drawable.hediedwith));
        lstBook.add(new Book( "Md Mafidul Islam","2004331010","Kastech Software Solution Group USA","Batch: 2004  || Position: Senior Software Engineer || Email: mohid04csesust@gmail.com || Contact No: 1711082694 ||" , R.drawable.mariasemples));
        lstBook.add(new Book( "Md Mahadi Hasan Nahid","2010331044","Assistant Prof. at SUST","Batch: 2010  || Position: Assistant Professor || Email: nahid.cse.sust@gmail.com || Contact No: 01738150127 ||" , R.drawable.themartian));
        lstBook.add(new Book(  "Md Mahmudul Haque","2005331004","BizMotion Ltd","Batch: 2005  || Position: Sr Software Engineer || Email: mahmudul.fahim@gmail.com || Contact No: 1717045212 ||", R.drawable.thevigitarian));
        lstBook.add(new Book("MD MAHMUDUR RAHMAN","2007331014","No Recent Company Found","Batch: 2007  || Position: N/A || Email: redoan2008@gmail.com || Contact No: 1671984964 ||"  , R.drawable.thewildrobot));

        lstBook.add(new Book( "Md Moniruzzaman","2014331055","No Recent Company Found","Batch: 2014  || Position: N/A || Email: monirulhasann@gmail.com || Contact No: 8801856529339 ||" , R.drawable.hediedwith));
        lstBook.add(new Book("Md Moustafa Uddin","2000330061","Portonics Limited","Batch: 2000  || Position: Operations Manager || Email: emon_061@yahoo.com || Contact No: 1678688218 ||"  , R.drawable.mariasemples));
        lstBook.add(new Book(  "MD MURSHID SARKER","2004331067","Spectrum Engineering Consortium Ltd","Batch: 2004  || Position: Asst. Manager || Email: murshid_cse_sust@yahoo.com || Contact No: 8801722390678 ||", R.drawable.themartian));
        lstBook.add(new Book("Md Naimul Hasnat","2004331096","Rahimafrooz Bangladesh Limited","Batch: 2004  || Position: System Analyst || Email: naimul.cse.bd@gmail.com || Contact No: 1710459972 ||"  , R.drawable.thevigitarian));
        lstBook.add(new Book("Md Rafikul Islam Farhad","2013331032","InfancyIT","Batch: 2013  || Position: Junior Software Engineer || Email: rafikfarhad@gmail.com || Contact No: 8801670904026 ||"  , R.drawable.thewildrobot));

        //copy these five

        /*
        lstBook.add(new Book(  , R.drawable.hediedwith));
        lstBook.add(new Book(  , R.drawable.mariasemples));
        lstBook.add(new Book(  , R.drawable.themartian));
        lstBook.add(new Book(  , R.drawable.thevigitarian));
        lstBook.add(new Book(  , R.drawable.thewildrobot));

        lstBook.add(new Book(  , R.drawable.hediedwith));
        lstBook.add(new Book(  , R.drawable.mariasemples));
        lstBook.add(new Book(  , R.drawable.themartian));
        lstBook.add(new Book(  , R.drawable.thevigitarian));
        lstBook.add(new Book(  , R.drawable.thewildrobot));


        lstBook.add(new Book(  , R.drawable.hediedwith));
        lstBook.add(new Book(  , R.drawable.mariasemples));
        lstBook.add(new Book(  , R.drawable.themartian));
        lstBook.add(new Book(  , R.drawable.thevigitarian));
        lstBook.add(new Book(  , R.drawable.thewildrobot));
         */


     /*   lstBook.add(new Book("The Wild Robot", "Categorie Book", "Description book", R.drawable.thewildrobot));
        lstBook.add(new Book("Maria Semples", "Categorie Book", "Description book", R.drawable.mariasemples));
        lstBook.add(new Book("The Martian", "Categorie Book", "Description book", R.drawable.themartian));
        lstBook.add(new Book("He Died with...", "Categorie Book", "Description book", R.drawable.hediedwith));
        lstBook.add(new Book("The Vegitarian", "Categorie Book", "Description book", R.drawable.thevigitarian));


*/


        RecyclerView myrv = (RecyclerView) findViewById(R.id.recyclerview_id);
        recyclerViewAdapter = new RecyclerViewAdapter(this,lstBook);
        myrv.setLayoutManager(new GridLayoutManager(this, 3));
        myrv.setAdapter(recyclerViewAdapter);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        MenuItem item = menu.findItem(R.id.action_search);
        SearchView searchView = (SearchView) MenuItemCompat.getActionView(item);
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {

            @Override
            public boolean onQueryTextSubmit(String query) {
                //RecyclerViewAdapter.getFilter().filter(query);
                recyclerViewAdapter.getFilter().filter(query);
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                //RecyclerViewAdapter.getFilter().filter(newText);
                recyclerViewAdapter.getFilter().filter(newText);
                return false;
            }
        });
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        int id = item.getItemId();
        if (id==R.id.home_page)
        {
            Intent intent= new Intent(MainActivity2.this, HomeActivity.class);
            startActivity(intent);

        }
        if (id==R.id.log_out){
            sendToStart();
        }
        return super.onOptionsItemSelected(item);
    }
    void sendToStart(){
        FirebaseAuth.getInstance().signOut();
        Intent gohome = new Intent(MainActivity2.this, LoginActivity.class);
        startActivity(gohome);
        finish();
    }
}

