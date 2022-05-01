-- phpMyAdmin SQL Dump
-- version 5.1.3
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1
-- Généré le : dim. 24 avr. 2022 à 18:01
-- Version du serveur : 10.4.24-MariaDB
-- Version de PHP : 7.4.29

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données : `recthatsheet`
--

-- --------------------------------------------------------

--
-- Structure de la table `album`
--

CREATE TABLE `album` (
  `AlbumID` int(11) NOT NULL,
  `Name` varchar(60) NOT NULL,
  `Artist` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `album`
--

INSERT INTO `album` (`AlbumID`, `Name`, `Artist`) VALUES
(1, 'Fear of the Dark', 13),
(2, 'The Source', 14),
(3, 'Discovery', 1),
(4, 'Wildcat', 2),
(5, 'The Eminem Show', 3),
(6, 'good kid, m.A.A.d city', 4),
(7, 'Kind of Blue', 5),
(8, 'Tell Mama', 8),
(9, 'Beyoncé', 10),
(10, 'Confessions', 9),
(11, 'Aftermath', 11),
(12, 'The Wall', 12);

-- --------------------------------------------------------

--
-- Structure de la table `artist`
--

CREATE TABLE `artist` (
  `ArtistID` int(11) NOT NULL,
  `Name` varchar(60) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `artist`
--

INSERT INTO `artist` (`ArtistID`, `Name`) VALUES
(1, 'Daft Punk'),
(2, 'Ratatat'),
(3, 'Eminem'),
(4, 'Kendrick Lamar'),
(5, 'Miles Davis'),
(6, 'Louis Armstrong'),
(7, 'B.B. King'),
(8, 'Etta James'),
(9, 'Usher'),
(10, 'Beyoncé'),
(11, 'The Rolling Stones'),
(12, 'Pink Floyd'),
(13, 'Iron Maiden'),
(14, 'Ayreon');

-- --------------------------------------------------------

--
-- Structure de la table `genre`
--

CREATE TABLE `genre` (
  `GenreID` int(11) NOT NULL,
  `Name` varchar(60) NOT NULL,
  `Origin` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `genre`
--

INSERT INTO `genre` (`GenreID`, `Name`, `Origin`) VALUES
(1, 'Electronique', NULL),
(2, 'Jazz', 4),
(3, 'Hip Hop', 2),
(4, 'Blues', NULL),
(5, 'RnB', 2),
(6, 'Rock', 4),
(7, 'Metal', 6);

-- --------------------------------------------------------

--
-- Structure de la table `musique`
--

CREATE TABLE `musique` (
  `SongID` int(11) NOT NULL,
  `Name` varchar(60) NOT NULL,
  `Artist` int(11) NOT NULL,
  `Genre` int(11) NOT NULL,
  `Album` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `musique`
--

INSERT INTO `musique` (`SongID`, `Name`, `Artist`, `Genre`, `Album`) VALUES
(1, 'Loud Pipes', 2, 1, 4),
(2, 'One More Time', 1, 1, 3),
(3, 'Without Me', 3, 3, 5),
(4, 'Backseat Freestyle', 4, 3, 6),
(5, 'What A Wonderful World', 6, 2, NULL),
(6, 'So What', 5, 2, 7),
(7, 'The Thrill Is Gone', 7, 4, NULL),
(8, 'I\'d Rather Go Blind', 8, 4, 8),
(9, 'Partition', 10, 5, 9),
(10, 'Yeah!', 9, 5, 10),
(11, 'Paint It Black', 11, 6, 11),
(12, 'Comfortably Numb', 12, 6, 12),
(13, 'Fear of the Dark', 13, 7, 1),
(14, 'Everybody Dies', 14, 7, 2);

--
-- Index pour les tables déchargées
--

--
-- Index pour la table `album`
--
ALTER TABLE `album`
  ADD PRIMARY KEY (`AlbumID`);

--
-- Index pour la table `artist`
--
ALTER TABLE `artist`
  ADD PRIMARY KEY (`ArtistID`);

--
-- Index pour la table `genre`
--
ALTER TABLE `genre`
  ADD PRIMARY KEY (`GenreID`);

--
-- Index pour la table `musique`
--
ALTER TABLE `musique`
  ADD PRIMARY KEY (`SongID`);

--
-- AUTO_INCREMENT pour les tables déchargées
--

--
-- AUTO_INCREMENT pour la table `album`
--
ALTER TABLE `album`
  MODIFY `AlbumID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- AUTO_INCREMENT pour la table `artist`
--
ALTER TABLE `artist`
  MODIFY `ArtistID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;

--
-- AUTO_INCREMENT pour la table `genre`
--
ALTER TABLE `genre`
  MODIFY `GenreID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT pour la table `musique`
--
ALTER TABLE `musique`
  MODIFY `SongID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
