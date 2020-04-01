# MusicLibraryWebApplication
База: добавляем недостающую таблицу, identity для айдишников.
Клиент: по ангуляру для осознания базовых концептов (https://angular.io/guide/architecture) пройти туториал (https://angular.io/tutorial). На русском можно поискать  переводы. Подключаем ng-bootstrap. 
Сервер: разница между Controller и RestController. Подключаем базу

## Работа с серверной частью
Запускается на порту - 82 (порт указывается в файле 'application.properties')
В папке DbScripts есть два скрипта (create_db.bat и drop_db.bat) для создания и схемы бд
ОБЯЗАТЕЛЬНО: перед созданием базы создать пользователя c##SA - 12345678 выдать базовые права 

Список всех доступных запросов:
ArtistController:
	{POST /artists/getArtistsByGenre}: getArtistsByGenre(GenreDTO)
	{POST /artists/}: addArtist(ArtistDTO)
	{DELETE /artists/{id}}: deleteArtist(int)
	{GET /artists/{id}}: getArtist(int)
	{PUT /artists/{id}}: updateArtist(int,ArtistDTO)
	{GET /artists/}: getAllArtists()
GenreController:
	{DELETE /genres/{id}}: deleteGenre(int)
	{POST /genres/}: addGenre(GenreDTO)
	{GET /genres/{id}}: getGenre(int)
	{GET /genres/}: getAllGenre()
	{PUT /genres/{id}}: updateGenre(int,GenreDTO)
TrackController:
	{POST /tracks/getAllTrackFromReleasePeriod}: getAllTrackFromReleasePeriod(Date,Date)
	{GET /tracks/}: getAllTrack()
	{PUT /tracks/{id}}: updateTrack(int,TrackDTO)
	{POST /tracks/}: addGenre(TrackDTO)
	{DELETE /tracks/{id}}: deleteTrack(int)
	{GET /tracks/{id}}: getTrack(int)


