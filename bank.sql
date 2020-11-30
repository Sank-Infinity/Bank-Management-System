-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 30, 2020 at 04:06 PM
-- Server version: 10.4.16-MariaDB
-- PHP Version: 7.3.24

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `bank`
--

-- --------------------------------------------------------

--
-- Table structure for table `cash_details`
--

CREATE TABLE `cash_details` (
  `Card_number` varchar(30) NOT NULL,
  `Deposit` varchar(20) NOT NULL,
  `Withdrawn` varchar(20) NOT NULL,
  `Available` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `cash_details`
--

INSERT INTO `cash_details` (`Card_number`, `Deposit`, `Withdrawn`, `Available`) VALUES
('4217903639198578', '1000', '200', '10750');

-- --------------------------------------------------------

--
-- Table structure for table `details`
--

CREATE TABLE `details` (
  `card_no` varchar(50) NOT NULL,
  `pin_no` varchar(20) NOT NULL,
  `name` varchar(30) NOT NULL,
  `father_name` varchar(30) NOT NULL,
  `date` varchar(30) NOT NULL,
  `gender` varchar(20) NOT NULL,
  `email` varchar(30) NOT NULL,
  `marital_status` varchar(20) NOT NULL,
  `address` varchar(50) NOT NULL,
  `city` varchar(20) NOT NULL,
  `pin_code` varchar(20) NOT NULL,
  `state` varchar(20) NOT NULL,
  `pan_number` varchar(30) NOT NULL,
  `adhar_number` varchar(30) NOT NULL,
  `mobile_number` varchar(30) NOT NULL,
  `account_type` varchar(30) NOT NULL,
  `atm_service` varchar(20) NOT NULL,
  `netbanking` varchar(20) NOT NULL,
  `mobbanking` varchar(20) NOT NULL,
  `mail_alert` varchar(20) NOT NULL,
  `cheque_book` varchar(20) NOT NULL,
  `E_statement` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `details`
--

INSERT INTO `details` (`card_no`, `pin_no`, `name`, `father_name`, `date`, `gender`, `email`, `marital_status`, `address`, `city`, `pin_code`, `state`, `pan_number`, `adhar_number`, `mobile_number`, `account_type`, `atm_service`, `netbanking`, `mobbanking`, `mail_alert`, `cheque_book`, `E_statement`) VALUES
('4217903639198578', '8429', 'Aishwarya', 'Ganesh', '19/11/1999', 'Female', 'aishwarya@gmail.com', 'Unmarried', 'latur', 'latur', '413515', 'maharashtra', 'abcd1234', '147896324563', '123456789', 'Savings Account', 'ATM Service', 'Internet Banking', 'Mobile Banking', 'Email Service', 'Cheque Book', 'E-Statement');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
