-- phpMyAdmin SQL Dump
-- version 4.6.6deb5ubuntu0.5
-- https://www.phpmyadmin.net/
--
-- Host: localhost:3306
-- Generation Time: Feb 05, 2026 at 04:07 PM
-- Server version: 5.7.42-0ubuntu0.18.04.1
-- PHP Version: 7.0.33-31+ubuntu16.04.1+deb.sury.org+1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `springbootapp`
--

-- --------------------------------------------------------

--
-- Table structure for table `product_info`
--

CREATE TABLE `product_info` (
  `id` int(12) NOT NULL,
  `name` varchar(50) NOT NULL,
  `quantity` int(12) NOT NULL,
  `price` double(12,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `product_info`
--

INSERT INTO `product_info` (`id`, `name`, `quantity`, `price`) VALUES
(1, 'B Rice', 51, 90.00),
(2, 'K Rice', 50, 45.00),
(3, 'D Rice', 100, 120.00),
(4, 'R Rice', 40, 10.00),
(9, 'xyz', 345, 1.00),
(11, 'D Honey', 566, 65.00);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `product_info`
--
ALTER TABLE `product_info`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `product_info`
--
ALTER TABLE `product_info`
  MODIFY `id` int(12) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
