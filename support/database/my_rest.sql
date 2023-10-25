-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1
-- Généré le : mer. 25 oct. 2023 à 21:35
-- Version du serveur : 10.4.28-MariaDB
-- Version de PHP : 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données : `my_rest`
--

-- --------------------------------------------------------

--
-- Structure de la table `person_entity`
--

CREATE TABLE `person_entity` (
  `id` int(11) NOT NULL,
  `last_name` varchar(255) DEFAULT NULL,
  `first_name` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

-- --------------------------------------------------------

--
-- Structure de la table `person_entity_seq`
--

CREATE TABLE `person_entity_seq` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

--
-- Déchargement des données de la table `person_entity_seq`
--

INSERT INTO `person_entity_seq` (`next_val`) VALUES
(1);

-- --------------------------------------------------------

--
-- Structure de la table `t_person`
--

CREATE TABLE `t_person` (
  `id` int(11) NOT NULL,
  `first_name` varchar(100) NOT NULL,
  `last_name` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

--
-- Déchargement des données de la table `t_person`
--

INSERT INTO `t_person` (`id`, `first_name`, `last_name`) VALUES
(1, 'Doe', 'John wick'),
(3, 'Doe', 'Jim');

-- --------------------------------------------------------

--
-- Structure de la table `t_person_seq`
--

CREATE TABLE `t_person_seq` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

--
-- Déchargement des données de la table `t_person_seq`
--

INSERT INTO `t_person_seq` (`next_val`) VALUES
(51);

--
-- Index pour les tables déchargées
--

--
-- Index pour la table `person_entity`
--
ALTER TABLE `person_entity`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `t_person`
--
ALTER TABLE `t_person`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT pour les tables déchargées
--

--
-- AUTO_INCREMENT pour la table `t_person`
--
ALTER TABLE `t_person`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
