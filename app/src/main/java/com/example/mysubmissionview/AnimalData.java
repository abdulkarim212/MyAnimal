package com.example.mysubmissionview;

import java.util.ArrayList;

public class AnimalData {
    private static String[]  animalNames={
            "Ayam",
            "Buaya",
            "Cobra",
            "Elang",
            "Gajah",
            "Harimau",
            "Komodo",
            "Merpati",
            "Singa",
            "Unta"
    };
    private static String[] animalDetails = {
            "Ayam adalah hewan aves atau unggas. bernafas dengan paru paru, tudak bisa terbang, memiliki paruh, memiliki 2 kaki yg fungsinya untuk mengais tanah agar bisa mencari makanan.\n" +
                    "pada ayam jantan memiliki ceker dan jengger. hanya ayam jantan yg bisa betkokok\n" +
                    "ayam hewan yg berkembang biak dengan telur, mengerami telurnya selama 3 minggu lamamnya. ayam biasanya makan cacing jagung beras dan tanaman muda\n" +
                    "\n" +
                    "Simak lebih lanjut di Brainly.co.id - https://brainly.co.id/tugas/2993428#readmore ",
            "Buaya adalah reptil bertubuh besar yang hidup di air. Secara ilmiah, buaya meliputi seluruh spesies anggota suku Crocodylidae, termasuk pula buaya sepit (Tomistoma schlegelii). Meski demikian nama ini dapat pula dikenakan secara longgar untuk menyebut ‘buaya’ aligator, kaiman dan gavial; yakni kerabat-kerabat buaya yang berlainan suku.\n" +
                    "\n" +
                    "Buaya umumnya menghuni habitat perairan tawar seperti sungai, danau, rawa dan lahan basah lainnya, namun ada pula yang hidup di air payau seperti buaya muara. Makanan utama buaya adalah hewan-hewan bertulang belakang seperti bangsa ikan, reptil dan mamalia, kadang-kadang juga memangsa moluska dan krustasea bergantung pada spesiesnya. Buaya merupakan hewan purba, yang hanya sedikit berubah karena evolusi semenjak zaman dinosaurus.",
            "Ular sendok atau yang juga dikenal dengan nama kobra adalah sejenis ular berbisa dari suku Elapidae. Disebut ular sendok (Jw., ula irus) karena ular ini dapat menegakkan dan memipihkan lehernya apabila merasa terganggu oleh musuhnya. Leher yang memipih dan melengkung itu serupa bentuk sendok atau irus (sendok sayur).",
            "Elang merupakan salah satu dari hewan yang terdapat di seluruh Indonesia. Dalam Bahasa inggris, eagle atau elang merujuk pada burung pemangsa berukuran besar dari suku Accipitridae terutama genus Aquila. Sementara itu burung-burung pemangsa yang lebih kecil dalam Daftar Burung Indonesia nomor 2 disebut Elang-alap (Hawk, genus Accipiter).",
            "Gajah adalah mamalia besar dari famili Elephantidae dan ordo Proboscidea. Secara tradisional, terdapat dua spesies yang diakui, yaitu gajah afrika (Loxodonta africana) dan gajah asia (Elephas maximus), walaupun beberapa bukti menunjukkan bahwa gajah semak afrika dan gajah hutan afrika merupakan spesies yang berbeda (L. africana dan L. cyclotis). Gajah tersebar di seluruh Afrika sub-Sahara, Asia Selatan, dan Asia Tenggara. Elephantidae adalah satu-satunya famili dari ordo Proboscidea yang masih ada; famili lain yang kini sudah punah termasuk mamut dan mastodon. Gajah afrika jantan merupakan hewan darat terbesar dengan tinggi hingga 4 m dan massa yang juga dapat mencapai 7.000 kg. Gajah memiliki ciri-ciri khusus, dan yang paling mencolok adalah belalai atau proboscis yang digunakan untuk banyak hal, terutama untuk bernapas, menghisap air, dan mengambil benda. Gigi serinya tumbuh menjadi taring yang dapat digunakan sebagai senjata dan alat untuk memindahkan benda atau menggali. Daun telinganya yang besar membantu mengatur suhu tubuh mereka. Gajah afrika memiliki telinga yang lebih besar dan punggung yang cekung, sementara telinga gajah asia lebih kecil dan punggungnya cembung.",
            "Harimau (bahasa Latin: Panthera tigris) adalah hewan yang tergolong dalam filum Chordata, subfilum vertebrata, kelas mamalia, pemakan daging (karnivora), keluarga felidae (kucing), genus panthera, dan tergolong dalam spesies tigris.\n" +
                    "\n" +
                    "Harimau adalah jenis kucing terbesar dari spesiesnya, bahkan lebih besar dari singa. Harimau juga adalah kucing tercepat kedua dalam berlari, setelah citah. Dalam keseluruhan karnivora, harimau adalah kucing karnivora terbesar dan karnivora terbesar ketiga setelah beruang kutub dan beruang coklat.",
            "Komodo, atau juga disebut biawak komodo (Varanus komodoensis), adalah spesies biawak besar yang terdapat di Pulau Komodo, Rinca, Flores, Gili Motang, dan Gili Dasami di Provinsi Nusa Tenggara Timur, Indonesia.[1][2] Biawak ini oleh penduduk asli pulau Komodo juga disebut dengan nama setempat ora.[3]\n" +
                    "\n" +
                    "Komodo merupakan spesies terbesar dari familia Varanidae, sekaligus kadal terbesar di dunia, dengan rata-rata panjang 2-3 meter dan beratnya bisa mencapai 100 kg. Komodo merupakan pemangsa puncak di habitatnya karena sejauh ini tidak diketahui adanya hewan karnivora besar lain selain biawak ini di sebarang geografisnya.",
            "Merpati dan dara termasuk dalam famili Columbidae atau burung berparuh merpati dari ordo Columbiformes, yang mencakup sekitar 300 spesies burung kerabat pekicau. Dalam percakapan umum, istilah \"dara\" dan \"merpati\" dapat saling menggantikan. Dalam praktik ornitologi, terdapat suatu kecenderungan \"dara\" digunakan untuk spesies yang lebih kecil dan \"merpati\" untuk yang besar, tetapi hal ini tidak secara konsisten diterapkan, dan secara historis nama umum untuk burung-burung tersebut memiliki banyak variasi antara istilah \"dara\" dan \"merpati.\" Famili ini terdapat di seluruh dunia, tetapi varietas terbesar terdapat di Indomalaya dan Ekozona Australasia. Dara dan merpati muda disebut \"squabs.\"",
            "Singa (bahasa Sanskerta: Siṃha, atau dalam bahasa Latin: Panthera leo) adalah spesies hewan dari keluarga felidae atau jenis kucing. Singa merupakan hewan yang hidup berkelompok. Biasanya terdiri dari seekor jantan dan banyak betina. Kelompok ini menjaga daerah kekuasaannya. Umur singa antara 10 sampai 15 tahun di alam bebas, tetapi dalm penangkaran memungkinkan lebih dari 20 tahun.\n" +
                    "\n" +
                    "Singa betina jauh lebih aktif dalam berburu, sedangkan singa jantan lebih santai bersikap menunggu dan meminta jatah dari hasil buruan para betinanya. Singa jantan dipercaya lebih unggul dan perkasa dibandingkan dengan kucing besar lainnya, tetapi kelemahan singa ialah tidak bisa memanjat pohon sebagus kucing-kucing besar lainnya. Singa jantan ditumbuhi bulu tebal di sekitar tengkuknya, hal ini lebih menguntungkan untuk melindungi tengkuknya, terutama dalam perkelahian bebas antara kucing besar yang cenderung menerkam tengkuk untuk melumpuhkan musuhnya.",
            "Unta atau Onta adalah dua spesies hewan berkuku belah dari genus Camelus (satu berpunuk tunggal - Camelus dromedarius, satu lagi berpunuk ganda - Camelus bactrianus) yang hidup ditemukan di wilayah kering dan gurun di Asia dan Afrika Utara. Rata-rata umur harapan hidup unta adalah antara 30 sampai 50 tahun.\n" +
                    "\n" +
                    "Domestikasi unta oleh manusia telah dimulai sejak kurang lebih 5.000 tahun yang lalu. Pemanfaatan unta antara lain untuk diambil susu (yang memiliki nilai nutrisi lebih tinggi daripada susu sapi) serta dagingnya, dan juga digunakan sebagai hewan pekerja."

    };
    private static int[] animalImages = {
            R.drawable.ayam,
            R.drawable.buaya,
            R.drawable.cobra,
            R.drawable.elang,
            R.drawable.gajah,
            R.drawable.harimau,
            R.drawable.komodo,
            R.drawable.merpati,
            R.drawable.singa,
            R.drawable.unta


    };

    static ArrayList<Animal> getListData() {
        ArrayList<Animal> list = new ArrayList<>();
        for (int position = 0; position < animalNames.length; position++){
            Animal animal = new Animal();
            animal.setName(animalNames[position]);
            animal.setDetail(animalDetails[position]);
            animal.setPhoto(animalImages[position]);
            list.add(animal);
        }
        return list;
    }

}
