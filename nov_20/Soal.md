## **Materi	: Evaluating a solution**  

Tujuan	: Peserta dapat menentukan apakah solusi yang mereka berikan sudah benar, efisien, elegan, dan usable.  
**Pertanyaan 1:**  
Buatlah program sebagai solusi dan dapat memanipulasi string yang diinputkan oleh User. Setiap huruf yang sama, ditampilkan berturut-turut, urutan sesuai kemunculan huruf pada input string.  

Contoh 1:  
Input : hello world  
Output : hellloowrd  
  
Contoh 2:  
Input : bahasa pemrograman  
Output : baaaaahspemmrrogn

**Pertanyaan 2:**  
Buatlah sebuah program untuk mengurutkan kata berdasarkan Nilai Kata dalam kalimat yang diinputkan oleh user secara ascending. Buatlah method CountWord() untuk menentukan besar nilai kata ditentukan dari total nilai ASCII tiap-tiap huruf dari kata tersebut. Untuk memudahkan, jadikan semua huruf menjadi huruf besar.   
Contoh :  
Inputkan kalimat: Ayah bekerja ibu arisan  
Kata:  
AYAH: 65 + 89 + 65 + 72 = 291  
BEKERJA = 66 + 69 + 75 + 69 + 82 + 74 + 65 = 500  
IBU = 73 + 66 + 85 = 224  
ARISAN = 65 + 82 + 73 + 83 + 65 + 78 = 446  
Urutan : IBU AYAH ARISAN BEKERJA  

**Pertanyaan 3:**  
Buat fungsi untuk melakukan perbandingan terhadap 2 buah string.  
Fungsi nya seperti ini -> int Banding2String(char kal1[30], char kal2[30])  
Fungsi akan mengeluarkan:  
1 	  jika kal1>kal2  
-1	  jika kal1<kal2  
nol (0)   jika kal1=kal2  

Cara membandingkan string adalah secara alphabetical order, contohnya  
Kal1 = surabaya  
Kal2 = surakarta  
Dari karakter ke-0 (‘s’) sampai dengan karakter ke-3 (‘a’), semuanya sama, tetapi di karakter ke-4 , pada Kal1 terdapat karakter ‘b’ dan Kal2 terdapat karakter ‘k’. Karakter ’b’ lebih kecil dari karakter ’k’. Sehingga fungsi langsung mengeluarkan angka -1.  

Setelah Anda membuat fungsi Banding2String tersebut, pada main program, buatlah program untuk memasukkan dua buah string, memanggil fungsi Banding2String dan menampilkan hasil seperti contoh di bawah.  
Contoh :  
Input:  
Input string1 : hari senin  
Input string2 : hari selasa  
Output: 
1  
String1 lebih besar dari string2  
