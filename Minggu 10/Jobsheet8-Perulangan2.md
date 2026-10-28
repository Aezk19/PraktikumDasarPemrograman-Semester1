# JOBSHEET 8 - PERULANGAN 2

**Identitas Mahasiswa:**
* **Nama:** Muhammad Akbar
* **NIM:** 264107020029
* **Kelas/No. Presensi:** TI-1D/21

---

## 1: TUJUAN PRAKTIKUM

Berikut adalah tujuan pelaksanaan praktikum pada bab ini:

1. Memahami konsep perulangan bersarang pada algoritma
2. Memahami alur perulangan bersarang
3. Mengenal sintaks perulangan bersarang
4. Mampu menerapkan perulangan bersarang untuk menyelesaikan studi kasus sederhana

---

## 2: HASIL PERCOBAAN & ANALISIS
### 2.1 Percobaan 1: Review Perulangan 1

#### 2.1.1 Kode Program Java
```java
// Tulis kode program StarNoAbsen.java di sini


```

#### 2.1.2 Hasil Running / Screenshot Output

#### 2.1.3 Jawaban Pertanyaan / Pertanyaan Refleksi

* **Pertanyaan 1:** Jika inisialisasi $i=1$ diubah menjadi $i=0$ tanpa mengubah kondisi, berapa karakter * yang tercetak ketika $n=5$? Jelaskan.
  * **Jawab:** Bintang (*) yang tercetak adalah 6, karena


* **Pertanyaan 2:** Jika kondisi $i<=n$ diganti menjadi $i<n$, berapa kali perulangan dijalankan saat $n = 5$? Mengapa hasilnya berbeda?
  * **Jawab:**  Bintang (*) yang tercetak adalah 4, berbeda karena

* **Pertanyaan 3:** Prediksi output potongan kode berikut ketika $n=9$, kemudian buktikan dengan mengganti perulangan FOR pada program Anda dan menjalankannya.

```java
    for (int i=2; i<=n; i+=2) {
        System.out.print(i + " ");
    }
```
Modifikasi kode tersebut agar mencetak bilangan ganjil positif yang tidak melebihi n.

  * **Jawab:**
* **Pertanyaan 4:** Jelaskan mengapa perubahan increment `i++` menjadi `i--` (dengan kondisi tetap $i<=n$) membuat perulangan berjalan terus-menerus dan tidak berhenti dalam waktu wajar untuk n positif.
  * **Jawab:**



---

### 2.2 Percobaan 2: Pola Bintang Persegi Panjang (Nested FOR)

#### 2.2.1 Kode Program Java

```java
// Tulis kode program RectangleNoAbsen.java di sini


```

#### 2.2.2 Hasil Running / Screenshot Output

#### 2.2.3 Jawaban Pertanyaan / Pertanyaan Refleksi

* **Pertanyaan 1:** Tentukan fungsi variabel `i` dan `j` pada program tersebut.
  * **Jawab:**


* **Pertanyaan 2:** Berapa kali outer loop, inner loop, dan perintah `print("*")` dijalankan untuk baris = 4 dan kolom = 7?
  * **Jawab:**


* **Pertanyaan 3:** Apa yang terjadi jika batas perulangan luar dan dalam ditukar (outer menggunakan kolom, inner menggunakan baris)? Gunakan baris = 3 dan kolom = 6 untuk menjelaskan.
  * **Jawab:**


* **Pertanyaan 4:** Jelaskan akibat penghapusan `System.out.println();` setelah inner loop.
  * **Jawab:**


* **Pertanyaan 5:** Modifikasi program agar karakter yang dicetak adalah #, lalu commit dan push perubahan ke GitHub.
  * **Jawab:** (Lampirkan screenshot atau modifikasi kode Anda di sini jika diperlukan)



---

### 2.3 Percobaan 3: Debugging Bintang Segitiga - Nested WHILE

#### 2.3.1 Kode Program Java

```java
// Tulis kode program TriangleNoAbsen.java yang sudah diperbaiki di sini


```

#### 2.3.2 Hasil Running / Screenshot Output

#### 2.3.3 Jawaban Pertanyaan / Pertanyaan Refleksi

* **Pertanyaan 1:** Sebutkan ketidaksesuaian output awal dan minimal dua perbaikan yang diperlukan untuk menghasilkan pola segitiga bertingkat.
  * **Jawab:**


* **Pertanyaan 2:** Jelaskan peran variabel `i` dan `j`. Mengapa nilai `j` harus diinisialisasi kembali ke 0 pada setiap iterasi outer loop? Apa yang terjadi jika `j` tidak di-reset?
  * **Jawab:**


* **Pertanyaan 3:** Jelaskan perubahan inisialisasi, kondisi, dan perubahan nilai (update) pada outer loop yang diperlukan untuk membentuk segitiga terbalik.
  * **Jawab:**



---

### 2.4 Percobaan 4: Studi Kasus Nilai Tugas Proyek Kelompok

#### 2.4.1 Kode Program Java

```java
// Tulis kode program NilaiKelompokNoAbsen.java di sini


```

#### 2.4.2 Hasil Running / Screenshot Output

#### 2.4.3 Jawaban Pertanyaan / Pertanyaan Refleksi

* **Pertanyaan 1:** Mengapa `totalNilai` perlu di-reset di dalam outer loop, tetapi `rataTertinggi` tidak boleh di-reset pada setiap kelompok?
  * **Jawab:**


* **Pertanyaan 2:** Untuk 3 kelompok dan 2 penilai (tanpa input yang salah), berapa kali badan perulangan FOR dijalankan secara keseluruhan?
  * **Jawab:**


* **Pertanyaan 3:** Apa yang terjadi jika `totalNilai` dideklarasikan sebagai `int` dan rata-rata dihitung menggunakan pembagian dua bilangan bulat? Berikan contoh nilai.
  * **Jawab:**


* **Pertanyaan 4:** Mengapa `rataTertinggi` diberi nilai awal -1, bukan 0? Berikan contoh input yang membuat hasil salah apabila nilai awalnya 0.
  * **Jawab:**


* **Pertanyaan 5:** Program ini memiliki tiga tingkat perulangan. Sebutkan masing-masing jenis perulangan beserta perannya.
  * **Jawab:**



---

## 3: TUGAS MANDIRI

Berikut adalah daftar tugas yang dikerjakan pada Jobsheet ini:

* [ ] **Tugas 1:** Pola Bilangan Bertingkat
* [ ] **Tugas 2:** Tabel Perkalian
* [ ] **Tugas 3:** Rekap Penjualan Beberapa Toko

### 3.1 Implementasi Kode Tugas

#### Tugas 1: Pola Bilangan Bertingkat

```java
// Tulis kode program Tugas1NoAbsen.java di sini


```

#### Tugas 2: Tabel Perkalian

```java
// Tulis kode program Tugas2NoAbsen.java di sini


```

#### Tugas 3: Rekap Penjualan Beberapa Toko

```java
// Tulis kode program Tugas3NoAbsen.java di sini


```

---

## 4: KESIMPULAN

(Tuliskan kesimpulan praktikum Anda di sini)