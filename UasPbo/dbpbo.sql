-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 18 Jun 2023 pada 21.00
-- Versi server: 10.4.25-MariaDB
-- Versi PHP: 8.1.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `dbpbo`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `tbakun`
--

CREATE TABLE `tbakun` (
  `iduser` int(11) NOT NULL,
  `username` varchar(50) NOT NULL,
  `email` varchar(50) NOT NULL,
  `telepon` varchar(15) NOT NULL,
  `password` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `tbakun`
--

INSERT INTO `tbakun` (`iduser`, `username`, `email`, `telepon`, `password`) VALUES
(3, 'user', 'user@gmail.com', '081254147462', 'user123'),
(6, 'user1', 'sjijsi', '122311', 'user123');

-- --------------------------------------------------------

--
-- Struktur dari tabel `tbmobil`
--

CREATE TABLE `tbmobil` (
  `idmobil` int(11) NOT NULL,
  `nama` varchar(50) NOT NULL,
  `harga` int(30) NOT NULL,
  `merk` varchar(30) NOT NULL,
  `waktupengisian` varchar(20) NOT NULL,
  `kapasitasbaterai` varchar(20) NOT NULL,
  `jenismotor` varchar(30) NOT NULL,
  `warna` varchar(30) NOT NULL,
  `kecepatanmaks` varchar(30) NOT NULL,
  `Fitur` varchar(100) NOT NULL,
  `tahunproduksi` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `tbmobil`
--

INSERT INTO `tbmobil` (`idmobil`, `nama`, `harga`, `merk`, `waktupengisian`, `kapasitasbaterai`, `jenismotor`, `warna`, `kecepatanmaks`, `Fitur`, `tahunproduksi`) VALUES
(1, 'nama', 1, 'Wulings', '1', '1', '', 'p', '1', 'p', 2003),
(2, 'nama', 1, 'Wulings', '1', '1', '', 'p', '1', 'p', 2003),
(3, 'nama', 1, 'Wulings', '1', '1', '', 'p', '1', 'p', 2003);

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `tbakun`
--
ALTER TABLE `tbakun`
  ADD PRIMARY KEY (`iduser`);

--
-- Indeks untuk tabel `tbmobil`
--
ALTER TABLE `tbmobil`
  ADD PRIMARY KEY (`idmobil`);

--
-- AUTO_INCREMENT untuk tabel yang dibuang
--

--
-- AUTO_INCREMENT untuk tabel `tbakun`
--
ALTER TABLE `tbakun`
  MODIFY `iduser` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT untuk tabel `tbmobil`
--
ALTER TABLE `tbmobil`
  MODIFY `idmobil` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
