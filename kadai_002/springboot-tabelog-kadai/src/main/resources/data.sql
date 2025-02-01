-- categoriesテーブル
INSERT IGNORE INTO categories (id, category_name) VALUES (1, 'うなぎ');
INSERT IGNORE INTO categories (id, category_name) VALUES (2, '味噌カツ');
INSERT IGNORE INTO categories (id, category_name) VALUES (3, '味噌煮込みうどん');
INSERT IGNORE INTO categories (id, category_name) VALUES (4, 'どて煮');
INSERT IGNORE INTO categories (id, category_name) VALUES (5, '味噌おでん');
INSERT IGNORE INTO categories (id, category_name) VALUES (6, '手羽先');
INSERT IGNORE INTO categories (id, category_name) VALUES (7, '小倉トースト');
INSERT IGNORE INTO categories (id, category_name) VALUES (8, '名古屋コーチン');
INSERT IGNORE INTO categories (id, category_name) VALUES (9, 'あんかけスパ');
INSERT IGNORE INTO categories (id, category_name) VALUES (10, '中華');

-- storesテーブル
INSERT IGNORE INTO stores (id, name, image_name, description, price_max, price_min, start, close, postal_code, address, phone_number, holiday, category_id) VALUES (1, 'うな重の匠', 'image_001.jpg', '炭火で焼いた本格的なうな重が楽しめる名店。', 5000, 2500, '11:00:00', '21:00:00', '460-0001', '名古屋市中区錦1-1-1', '052-123-4567', '水曜日', 1);
INSERT IGNORE INTO stores (id, name, image_name, description, price_max, price_min, start, close, postal_code, address, phone_number, holiday, category_id) VALUES (2, 'ひつまぶし本舗', 'image_002.jpg', 'ひつまぶし発祥の地で、絶品の味を提供。', 6000, 3000, '10:30:00', '20:30:00', '460-0002', '名古屋市中区丸の内2-2-2', '052-234-5678', '火曜日', 1);
INSERT IGNORE INTO stores (id, name, image_name, description, price_max, price_min, start, close, postal_code, address, phone_number, holiday, category_id) VALUES (3, '味噌カツ亭', 'image_003.jpg', 'こだわりの八丁味噌で仕上げた自慢の味噌カツ。', 2000, 1200, '11:00:00', '22:00:00', '460-0003', '名古屋市中区栄3-3-3', '052-345-6789', '月曜日', 2);
INSERT IGNORE INTO stores (id, name, image_name, description, price_max, price_min, start, close, postal_code, address, phone_number, holiday, category_id) VALUES (4, '味噌カツ工房', 'image_004.jpg', 'サクサクの衣と濃厚な味噌が絶品。', 2500, 1500, '10:00:00', '21:00:00', '460-0004', '名古屋市中区新栄4-4-4', '052-456-7890', '日曜日', 2);
INSERT IGNORE INTO stores (id, name, image_name, description, price_max, price_min, start, close, postal_code, address, phone_number, holiday, category_id) VALUES (5, '煮込み屋本店', 'image_005.jpg', '濃厚な味噌スープが特徴の名古屋名物店。', 1800, 900, '10:30:00', '21:30:00', '460-0005', '名古屋市中区金山5-5-5', '052-567-8901', '月曜日', 3);
INSERT IGNORE INTO stores (id, name, image_name, description, price_max, price_min, start, close, postal_code, address, phone_number, holiday, category_id) VALUES (6, '味噌うどん一番', 'image_006.jpg', 'コシのある麺が自慢の味噌煮込みうどん専門店。', 2000, 1000, '11:00:00', '22:00:00', '460-0006', '名古屋市中区東桜6-6-6', '052-678-9012', '火曜日', 3);
INSERT IGNORE INTO stores (id, name, image_name, description, price_max, price_min, start, close, postal_code, address, phone_number, holiday, category_id) VALUES (7, 'どて煮の達人', 'image_007.jpg', '秘伝のタレで煮込んだ名古屋の名物料理。', 1500, 800, '12:00:00', '23:00:00', '460-0007', '名古屋市中区名駅7-7-7', '052-789-0123', '水曜日', 4);
INSERT IGNORE INTO stores (id, name, image_name, description, price_max, price_min, start, close, postal_code, address, phone_number, holiday, category_id) VALUES (8, 'どて煮専門店 味噌や', 'image_008.jpg', '地元の味を大切にしたどて煮専門店。', 1600, 900, '11:00:00', '21:00:00', '460-0008', '名古屋市中区伏見8-8-8', '052-890-1234', '木曜日', 4);
INSERT IGNORE INTO stores (id, name, image_name, description, price_max, price_min, start, close, postal_code, address, phone_number, holiday, category_id) VALUES (9, 'おでん亭 味噌の香り', 'image_009.jpg', '八丁味噌で煮込んだ深い味わいの味噌おでん。', 2000, 1000, '16:00:00', '23:00:00', '460-0009', '名古屋市中区大須9-9-9', '052-901-2345', '日曜日', 5);
INSERT IGNORE INTO stores (id, name, image_name, description, price_max, price_min, start, close, postal_code, address, phone_number, holiday, category_id) VALUES (10, '味噌おでん処 まる', 'image_010.jpg', '地元の食材を使ったこだわりの味噌おでん。', 1800, 900, '17:00:00', '22:00:00', '460-0010', '名古屋市中区栄10-10-10', '052-012-3456', '火曜日', 5);
INSERT IGNORE INTO stores (id, name, image_name, description, price_max, price_min, start, close, postal_code, address, phone_number, holiday, category_id) VALUES (11, '手羽先山本', 'image_011.jpg', 'ジューシーでスパイシーな手羽先が人気。', 2200, 1100, '17:00:00', '23:30:00', '460-0011', '名古屋市中区錦11-11-11', '052-123-6789', '月曜日', 6);
INSERT IGNORE INTO stores (id, name, image_name, description, price_max, price_min, start, close, postal_code, address, phone_number, holiday, category_id) VALUES (12, '世界の手羽先屋', 'image_012.jpg', '世界中の手羽先が楽しめるユニークなお店。', 2500, 1300, '16:30:00', '23:00:00', '460-0012', '名古屋市中区丸の内12-12-12', '052-234-6789', '水曜日', 6);
INSERT IGNORE INTO stores (id, name, image_name, description, price_max, price_min, start, close, postal_code, address, phone_number, holiday, category_id) VALUES (13, 'トーストカフェ ふわり', 'image_013.jpg', 'ふわふわのパンとたっぷりの小倉が絶品。', 800, 500, '08:00:00', '18:00:00', '460-0013', '名古屋市中区栄13-13-13', '052-345-6789', '木曜日', 7);
INSERT IGNORE INTO stores (id, name, image_name, description, price_max, price_min, start, close, postal_code, address, phone_number, holiday, category_id) VALUES (14, '小倉トースト専門店 もぐもぐ', 'image_014.jpg', '名古屋ならではの小倉トーストが楽しめる専門店。', 900, 600, '07:30:00', '17:30:00', '460-0014', '名古屋市中区新栄14-14-14', '052-456-7890', '日曜日', 7);
INSERT IGNORE INTO stores (id, name, image_name, description, price_max, price_min, start, close, postal_code, address, phone_number, holiday, category_id) VALUES (15, '名古屋コーチン焼鳥 ひだまり', 'image_015.jpg', '新鮮な名古屋コーチンを使った絶品焼鳥店。', 4000, 2000, '17:00:00', '22:30:00', '460-0015', '名古屋市中区金山15-15-15', '052-567-8901', '火曜日', 8);
INSERT IGNORE INTO stores (id, name, image_name, description, price_max, price_min, start, close, postal_code, address, phone_number, holiday, category_id) VALUES (16, 'コーチン料理 笹の葉', 'image_016.jpg', '名古屋コーチンを贅沢に使った多彩な料理を提供。', 5000, 3000, '18:00:00', '23:00:00', '460-0016', '名古屋市中区東桜16-16-16', '052-678-9012', '水曜日', 8);
INSERT IGNORE INTO stores (id, name, image_name, description, price_max, price_min, start, close, postal_code, address, phone_number, holiday, category_id) VALUES (17, 'あんかけスパゲティ 太陽', 'image_017.jpg', '特製ソースがたまらないあんかけスパ専門店。', 1500, 800, '11:00:00', '20:00:00', '460-0017', '名古屋市中区名駅17-17-17', '052-789-0123', '月曜日', 9);
INSERT IGNORE INTO stores (id, name, image_name, description, price_max, price_min, start, close, postal_code, address, phone_number, holiday, category_id) VALUES (18, 'スパゲティハウス マリオ', 'image_018.jpg', '名古屋らしい味わいのあんかけスパが人気。', 1600, 850, '11:30:00', '21:00:00', '460-0018', '名古屋市中区伏見18-18-18', '052-890-1234', '火曜日', 9);
INSERT IGNORE INTO stores (id, name, image_name, description, price_max, price_min, start, close, postal_code, address, phone_number, holiday, category_id) VALUES (19, '中華料理 福星楼', 'image_019.jpg', '本格中華が楽しめる老舗レストラン。', 3000, 1200, '11:00:00', '22:00:00', '460-0019', '名古屋市中区大須19-19-19', '052-901-2345', '水曜日', 10);
INSERT IGNORE INTO stores (id, name, image_name, description, price_max, price_min, start, close, postal_code, address, phone_number, holiday, category_id) VALUES (20, '中華飯店 彩華', 'image_020.jpg', '地元で人気の中華飯店。', 2500, 1000, '10:30:00', '21:30:00', '460-0020', '名古屋市中区栄20-20-20', '052-012-3456', '木曜日', 10);

-- rolesテーブル
INSERT IGNORE INTO roles (id, name) VALUES (1, 'ROLE_GENERAL');
INSERT IGNORE INTO roles (id, name) VALUES (2, 'ROLE_ADMIN');

-- usersテーブル
INSERT IGNORE INTO users (id, name, email, password,postal_code, address, phone_number, role_id, enabled) VALUES (1, '侍 太郎', 'taro.samurai@example.com', '$2a$10$2JNjTwZBwo7fprL2X4sv.OEKqxnVtsVQvuXDkI8xVGix.U3W5B7CO', '101-0022', '東京都千代田区神田練塀町300番地', '090-1234-5678', 1, true);
INSERT IGNORE INTO users (id, name, email, password,postal_code, address, phone_number, role_id, enabled) VALUES (2, '侍 花子', 'hanako.samurai@example.com', '$2a$10$2JNjTwZBwo7fprL2X4sv.OEKqxnVtsVQvuXDkI8xVGix.U3W5B7CO', '101-0022', '東京都千代田区神田練塀町300番地', '090-1234-5678', 2, true);
INSERT IGNORE INTO users (id, name, email, password,postal_code, address, phone_number, role_id, enabled) VALUES (3, '侍 義勝', 'yoshikatsu.samurai@example.com', 'password', '638-0644', '奈良県五條市西吉野町湯川X-XX-XX', '090-1234-5678', 1, false);
INSERT IGNORE INTO users (id, name, email, password,postal_code, address, phone_number, role_id, enabled) VALUES (4, '侍 幸美', 'sachimi.samurai@example.com', 'password', '342-0006', '埼玉県吉川市南広島X-XX-XX', '090-1234-5678', 1, false);
INSERT IGNORE INTO users (id, name, email, password,postal_code, address, phone_number, role_id, enabled) VALUES (5, '侍 雅', 'miyabi.samurai@example.com', 'password', '527-0209', '滋賀県東近江市佐目町X-XX-XX', '090-1234-5678', 1, false);
INSERT IGNORE INTO users (id, name, email, password,postal_code, address, phone_number, role_id, enabled) VALUES (6, '侍 正保', 'masayasu.samurai@example.com', 'password', '989-1203', '宮城県柴田郡大河原町旭町X-XX-XX', '090-1234-5678', 1, false);
INSERT IGNORE INTO users (id, name, email, password,postal_code, address, phone_number, role_id, enabled) VALUES (7, '侍 真由美', 'mayumi.samurai@example.com', 'password', '951-8015', '新潟県新潟市松岡町X-XX-XX', '090-1234-5678', 1, false);
INSERT IGNORE INTO users (id, name, email, password,postal_code, address, phone_number, role_id, enabled) VALUES (8, '侍 安民', 'yasutami.samurai@example.com', 'password', '241-0033', '神奈川県横浜市旭区今川町X-XX-XX', '090-1234-5678', 1, false);
INSERT IGNORE INTO users (id, name, email, password,postal_code, address, phone_number, role_id, enabled) VALUES (9, '侍 章緒', 'akio.samurai@example.com', 'password', '739-2103', '広島県東広島市高屋町宮領X-XX-XX', '090-1234-5678', 1, false);
INSERT IGNORE INTO users (id, name, email, password,postal_code, address, phone_number, role_id, enabled) VALUES (10, '侍 祐子', 'yuko.samurai@example.com', 'password', '601-0761', '京都府南丹市美山町高野X-XX-XX', '090-1234-5678', 1, false);

-- reservationsテーブル
INSERT IGNORE INTO reservations (id, user_id, store_id, reservation_day, number_of_people) VALUES (1, 1, 1, '2023-04-01', 2);
INSERT IGNORE INTO reservations (id, user_id, store_id, reservation_day, number_of_people) VALUES (2, 1, 2, '2023-04-01', 3);
INSERT IGNORE INTO reservations (id, user_id, store_id, reservation_day, number_of_people) VALUES (3, 1, 3, '2023-04-01', 4);
INSERT IGNORE INTO reservations (id, user_id, store_id, reservation_day, number_of_people) VALUES (4, 1, 4, '2023-04-01', 5);
INSERT IGNORE INTO reservations (id, user_id, store_id, reservation_day, number_of_people) VALUES (5, 1, 5, '2023-04-01', 2);
INSERT IGNORE INTO reservations (id, user_id, store_id, reservation_day, number_of_people) VALUES (6, 1, 6, '2023-04-01', 3);
INSERT IGNORE INTO reservations (id, user_id, store_id, reservation_day, number_of_people) VALUES (7, 1, 7, '2023-04-01', 4);
INSERT IGNORE INTO reservations (id, user_id, store_id, reservation_day, number_of_people) VALUES (8, 1, 8, '2023-04-01', 5);
INSERT IGNORE INTO reservations (id, user_id, store_id, reservation_day, number_of_people) VALUES (9, 1, 9, '2023-04-01', 2);
INSERT IGNORE INTO reservations (id, user_id, store_id, reservation_day, number_of_people) VALUES (10, 1, 10, '2023-04-01', 3);
INSERT IGNORE INTO reservations (id, user_id, store_id, reservation_day, number_of_people) VALUES (11, 1, 11, '2023-04-01', 4);

-- reviewsテーブル
INSERT IGNORE INTO reviews (id, user_id, store_id, score, content) VALUES (1, 1, 1, 5, 'とてもよかった');
INSERT IGNORE INTO reviews (id, user_id, store_id, score, content) VALUES (2, 2, 1, 4, 'とてもよかった');
INSERT IGNORE INTO reviews (id, user_id, store_id, score, content) VALUES (3, 3, 1, 5, 'とてもよかった');
INSERT IGNORE INTO reviews (id, user_id, store_id, score, content) VALUES (4, 4, 1, 4, 'とてもよかった');
INSERT IGNORE INTO reviews (id, user_id, store_id, score, content) VALUES (5, 5, 1, 5, 'とてもよかった');
INSERT IGNORE INTO reviews (id, user_id, store_id, score, content) VALUES (6, 6, 1, 4, 'とてもよかった');
INSERT IGNORE INTO reviews (id, user_id, store_id, score, content) VALUES (7, 7, 1, 3, 'イマイチだった');
INSERT IGNORE INTO reviews (id, user_id, store_id, score, content) VALUES (8, 8, 1, 2, 'イマイチだった');
INSERT IGNORE INTO reviews (id, user_id, store_id, score, content) VALUES (9, 9, 1, 3, 'イマイチだった');
INSERT IGNORE INTO reviews (id, user_id, store_id, score, content) VALUES (10, 10, 1, 2, 'イマイチだった');
INSERT IGNORE INTO reviews (id, user_id, store_id, score, content) VALUES (11, 11, 1, 3, 'イマイチだった');
INSERT IGNORE INTO reviews (id, user_id, store_id, score, content) VALUES (12, 12, 1, 3, 'イマイチだった');

-- favoritesテーブル
INSERT IGNORE INTO favorites (id, user_id, store_id) VALUES (1, 1, 1);
INSERT IGNORE INTO favorites (id, user_id, store_id) VALUES (2, 1, 2);
INSERT IGNORE INTO favorites (id, user_id, store_id) VALUES (3, 1, 3);
INSERT IGNORE INTO favorites (id, user_id, store_id) VALUES (4, 1, 4);
INSERT IGNORE INTO favorites (id, user_id, store_id) VALUES (5, 1, 5);
INSERT IGNORE INTO favorites (id, user_id, store_id) VALUES (6, 1, 6);
INSERT IGNORE INTO favorites (id, user_id, store_id) VALUES (7, 1, 7);
INSERT IGNORE INTO favorites (id, user_id, store_id) VALUES (8, 1, 8);
INSERT IGNORE INTO favorites (id, user_id, store_id) VALUES (9, 1, 9);
INSERT IGNORE INTO favorites (id, user_id, store_id) VALUES (10, 1, 10);
INSERT IGNORE INTO favorites (id, user_id, store_id) VALUES (11, 1, 11);
INSERT IGNORE INTO favorites (id, user_id, store_id) VALUES (12, 1, 12);

-- incsテーブル
INSERT IGNORE INTO incs (id, inc_name, ceo, create_day, postal_code, address, business) VALUES (1, '株式会社NagoyaEats', '田中 一郎', '2018-04-15', '141-0031', '東京都品川区西五反田2-10-2', '名古屋のグルメに特化したWEBアプリ「NagoyaEats」の企画・開発・運営。飲食店の検索・予約・口コミ機能を提供し、名古屋の食文化の魅力を全国に発信。');





