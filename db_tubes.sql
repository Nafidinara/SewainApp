-- phpMyAdmin SQL Dump
-- version 5.1.1deb5ubuntu1
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: Jan 08, 2024 at 02:09 PM
-- Server version: 8.0.35
-- PHP Version: 8.2.14

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_tubes`
--

-- --------------------------------------------------------

--
-- Table structure for table `kendaraan`
--

CREATE TABLE `kendaraan` (
  `id` int NOT NULL,
  `nama` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `jenis` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `tahunPembuatan` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `harga` int NOT NULL,
  `quantity` int NOT NULL,
  `spesifikasi` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `persyaratan` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `status` tinyint(1) NOT NULL,
  `crew` int DEFAULT NULL,
  `sopir` tinyint(1) DEFAULT NULL,
  `jmlMuatan` int DEFAULT NULL,
  `img` varchar(1024) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `kendaraan`
--

INSERT INTO `kendaraan` (`id`, `nama`, `jenis`, `tahunPembuatan`, `harga`, `quantity`, `spesifikasi`, `persyaratan`, `status`, `crew`, `sopir`, `jmlMuatan`, `img`) VALUES
(1, 'Boeing 737 Max Drake Air', 'Udara', '2011', 30000000, 3, 'standar', 'Flight License', 1, 0, 1, 0, 'Boeing1.png'),
(2, 'Boeing 666 Wrld', 'Udara', '2014', 25000000, 2, 'standar', 'Flight License', 1, 0, 1, 0, 'Boeing2.png'),
(3, 'Boeing 999 Juice', 'Udara', '2015', 35000000, 3, 'standar', 'Flight License', 1, 0, 1, 0, 'Boeing3.png'),
(4, 'Boeing 1400 Virgil', 'Udara', '2008', 80000000, 2, 'standar', 'Flight License', 1, 0, 1, 0, 'Boeing4.png'),
(5, 'Boeing 444 Red', 'Udara', '2013', 70000000, 2, 'standar', 'Flight License', 1, 0, 1, 0, 'Boeing5.png'),
(6, 'Boeing 420 Flower', 'Udara', '2006', 60000000, 3, 'standar', 'Flight License', 1, 0, 1, 0, 'Boeing6.png'),
(7, 'Boeing 212 Madrid', 'Udara', '2010', 50000000, 5, 'standar', 'Flight License', 1, 0, 1, 0, 'Boeing7.png'),
(8, 'Boeing 909 Kitkat', 'Udara', '2015', 40000000, 2, 'standar', 'Flight License', 1, 0, 1, 0, 'Boeing8.png'),
(9, 'Tesla Model Z', 'Darat', '2022', 1000000, 10, 'standar', 'Driver License', 1, 0, 1, 0, 'cars05.png'),
(10, 'Kapal Pesiar', 'Air', '2018', 15000000, 8, 'standar', 'Sailing License', 1, 0, 1, 0, 'cruiser.png'),
(11, 'Ducati Panigale V4', 'Darat', '2015', 4000000, 5, 'standar', 'Driver License', 1, 0, 1, 0, 'Ducati1.png'),
(12, 'Ducati Diavel Standard', 'Darat', '2020', 5000000, 1, 'standar', 'Driver License', 1, 0, 1, 0, 'Ducati2.png'),
(13, 'Ducati Monster 1200', 'Darat', '2012', 6000000, 15, 'standar', 'Driver License', 1, 0, 1, 0, 'Ducati3.png'),
(14, 'Ducati Hyperstrada', 'Darat', '2019', 7000000, 20, 'standar', 'Driver License', 1, 0, 1, 0, 'Ducati4.png'),
(15, 'Ducati Scrambler Sixty2', 'Darat', '2014', 8000000, 2, 'standar', 'Driver License', 1, 0, 1, 0, 'Ducati5.png'),
(16, 'Ducati Scrambler Urban Enduro', 'Darat', '2017', 9000000, 12, 'standar', 'Driver License', 1, 0, 1, 0, 'Ducati6.png'),
(17, 'Ducati Scrambler Full Throttle', 'Darat', '2019', 5000000, 3, 'standar', 'Driver License', 1, 0, 1, 0, 'Ducati7.png'),
(18, 'Ducati Multistrada 950', 'Darat', '2010', 6000000, 10, 'standar', 'Driver License', 1, 0, 1, 0, 'Ducati8.png'),
(19, 'Ducati Hypermotard 939', 'Darat', '2021', 7000000, 25, 'standar', 'Driver License', 1, 0, 1, 0, 'Ducati9.png'),
(20, 'F-16', 'Darat', '2018', 7500000, 15, 'standar', 'Flight License', 1, 0, 1, 0, 'f16.png'),
(21, 'Ferrari 420', 'Udara', '2016', 12000000, 1, 'standar', 'Driver License', 1, 0, 1, 0, 'ferrari.png'),
(22, 'Logo', 'Udara', '2023', 0, 30, 'standar', 'Boating License', 1, 0, 1, 0, 'Frame 3-2.png'),
(23, 'Helikopter 01', 'Udara', '2020', 5500000, 8, 'standar', 'Flight License', 1, 0, 1, 0, 'Helikopter1.png'),
(24, 'Helikopter 02', 'Udara', '2017', 6500000, 2, 'standar', 'Flight License', 1, 0, 1, 0, 'Helikopter2.png'),
(25, 'Helikopter 03', 'Udara', '2015', 7500000, 18, 'standar', 'Flight License', 1, 0, 1, 0, 'helikopter3.png'),
(26, 'Helikopter 04', 'Udara', '2018', 8500000, 1, 'standar', 'Flight License', 1, 0, 1, 0, 'heli.png'),
(27, 'Kawasaki Ninja', 'Darat', '2011', 1000000, 5, 'standar', 'Driver License', 1, 0, 1, 0, 'Honda1.png'),
(28, 'PCX', 'Darat', '2022', 2000000, 12, 'standar', 'Driver License', 1, 0, 1, 0, 'Honda2.png'),
(29, 'ZX-25R', 'Darat', '2019', 1500000, 6, 'standar', 'Driver License', 1, 0, 1, 0, 'Honda3.png'),
(30, 'Beat', 'Darat', '2016', 500000, 4, 'standar', 'Driver License', 1, 0, 1, 0, 'Honda4.png'),
(31, 'Jetski Aqua', 'Air', '2021', 8000000, 2, 'standar', 'Boating License', 1, 0, 1, 0, 'jetski.png'),
(32, 'Jack Sparrow Ship', 'Air', '2014', 7000000, 15, 'standar', 'Sailing License', 1, 0, 1, 0, 'kapalhantu.png'),
(33, 'Kawasaki Green Super', 'Darat', '2023', 4000000, 1, 'standarn', 'Driver License', 1, 0, 1, 0, 'kawasaki.png'),
(34, 'Fortuner', 'Darat', '2017', 2000000, 2, 'standar', 'Driver License', 1, 0, 1, 0, 'mobil-01.png'),
(35, 'Avanza', 'Darat', '2020', 2000000, 10, 'standar', 'Driver License', 1, 0, 1, 0, 'mobil-02.png'),
(36, 'Boeing Blue Airsky', 'Udara', '2022', 10000000, 50, 'standar', 'Flight License', 1, 0, 1, 0, 'pesawat-01.png'),
(37, 'Boeing White Sky', 'Udara', '2015', 20000000, 8, 'standar', 'Flight License', 1, 0, 1, 0, 'pesawat-02.png'),
(38, 'Private Jet', 'Udara', '2019', 15000000, 6, 'standar', 'Flight License', 1, 0, 1, 0, 'pesawat.png'),
(39, 'Sukoi 22-X', 'Udara', '2017', 2500000, 4, 'standar', 'Flight License', 1, 0, 1, 0, 'Sukoi1.png'),
(40, 'Sukoi 66-X', 'Udara', '2018', 1500000, 3, 'standar', 'Flight License', 1, 0, 1, 0, 'Sukoi2.png'),
(41, 'Yachty Boat', 'Air', '2021', 20000000, 100, 'standar', 'Sailing License', 1, 0, 1, 0, 'yacht.png');

-- --------------------------------------------------------

--
-- Table structure for table `pembayaran`
--

CREATE TABLE `pembayaran` (
  `id` int NOT NULL,
  `metode` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `jumlah` int NOT NULL,
  `status` tinyint(1) NOT NULL,
  `denda` int NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `penyewaan`
--

CREATE TABLE `penyewaan` (
  `id` int NOT NULL,
  `tglSewa` datetime NOT NULL,
  `tglKembali` datetime NOT NULL,
  `lamaSewa` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `status` tinyint(1) NOT NULL,
  `kendaraan_id` int NOT NULL,
  `pembayaran_id` int NOT NULL,
  `user_id` int NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `id` int NOT NULL,
  `nama` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `umur` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `nohp` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `email` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `username` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `password` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`id`, `nama`, `umur`, `nohp`, `email`, `username`, `password`) VALUES
(1, 'asda', 'asdad', 'asdasda', 'test@gmail.com', 'test1', 'test2');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `kendaraan`
--
ALTER TABLE `kendaraan`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `pembayaran`
--
ALTER TABLE `pembayaran`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `penyewaan`
--
ALTER TABLE `penyewaan`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `kendaraan`
--
ALTER TABLE `kendaraan`
  MODIFY `id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=42;

--
-- AUTO_INCREMENT for table `pembayaran`
--
ALTER TABLE `pembayaran`
  MODIFY `id` int NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `penyewaan`
--
ALTER TABLE `penyewaan`
  MODIFY `id` int NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
