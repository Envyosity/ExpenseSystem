PGDMP  +    7                {            trabalhoFinal    16.1    16.0     �           0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                      false            �           0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                      false            �           0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                      false            �           1262    16412    trabalhoFinal    DATABASE     �   CREATE DATABASE "trabalhoFinal" WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE_PROVIDER = libc LOCALE = 'Portuguese_Brazil.1252';
    DROP DATABASE "trabalhoFinal";
                postgres    false            �            1259    32804 	   categoria    TABLE     n   CREATE TABLE public.categoria (
    nome character varying(50) NOT NULL,
    id_categoria integer NOT NULL
);
    DROP TABLE public.categoria;
       public         heap    postgres    false            �            1259    32803    categoria_id_categoria_seq    SEQUENCE     �   CREATE SEQUENCE public.categoria_id_categoria_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 1   DROP SEQUENCE public.categoria_id_categoria_seq;
       public          postgres    false    218            �           0    0    categoria_id_categoria_seq    SEQUENCE OWNED BY     Y   ALTER SEQUENCE public.categoria_id_categoria_seq OWNED BY public.categoria.id_categoria;
          public          postgres    false    217            �            1259    49193    despesa    TABLE     �   CREATE TABLE public.despesa (
    id_despesa integer NOT NULL,
    id_pessoa integer,
    id_categoria integer,
    nome character varying(50),
    valor real,
    data date
);
    DROP TABLE public.despesa;
       public         heap    postgres    false            �            1259    49192    despesa_id_despesa_seq    SEQUENCE     �   CREATE SEQUENCE public.despesa_id_despesa_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 -   DROP SEQUENCE public.despesa_id_despesa_seq;
       public          postgres    false    220            �           0    0    despesa_id_despesa_seq    SEQUENCE OWNED BY     Q   ALTER SEQUENCE public.despesa_id_despesa_seq OWNED BY public.despesa.id_despesa;
          public          postgres    false    219            �            1259    32797    familiar    TABLE     j   CREATE TABLE public.familiar (
    nome character varying(50) NOT NULL,
    id_pessoa integer NOT NULL
);
    DROP TABLE public.familiar;
       public         heap    postgres    false            �            1259    32796    familiar_id_pessoa_seq    SEQUENCE     �   CREATE SEQUENCE public.familiar_id_pessoa_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 -   DROP SEQUENCE public.familiar_id_pessoa_seq;
       public          postgres    false    216            �           0    0    familiar_id_pessoa_seq    SEQUENCE OWNED BY     Q   ALTER SEQUENCE public.familiar_id_pessoa_seq OWNED BY public.familiar.id_pessoa;
          public          postgres    false    215            %           2604    32807    categoria id_categoria    DEFAULT     �   ALTER TABLE ONLY public.categoria ALTER COLUMN id_categoria SET DEFAULT nextval('public.categoria_id_categoria_seq'::regclass);
 E   ALTER TABLE public.categoria ALTER COLUMN id_categoria DROP DEFAULT;
       public          postgres    false    217    218    218            &           2604    49196    despesa id_despesa    DEFAULT     x   ALTER TABLE ONLY public.despesa ALTER COLUMN id_despesa SET DEFAULT nextval('public.despesa_id_despesa_seq'::regclass);
 A   ALTER TABLE public.despesa ALTER COLUMN id_despesa DROP DEFAULT;
       public          postgres    false    220    219    220            $           2604    32800    familiar id_pessoa    DEFAULT     x   ALTER TABLE ONLY public.familiar ALTER COLUMN id_pessoa SET DEFAULT nextval('public.familiar_id_pessoa_seq'::regclass);
 A   ALTER TABLE public.familiar ALTER COLUMN id_pessoa DROP DEFAULT;
       public          postgres    false    215    216    216            �          0    32804 	   categoria 
   TABLE DATA           7   COPY public.categoria (nome, id_categoria) FROM stdin;
    public          postgres    false    218   _       �          0    49193    despesa 
   TABLE DATA           Y   COPY public.despesa (id_despesa, id_pessoa, id_categoria, nome, valor, data) FROM stdin;
    public          postgres    false    220   �       �          0    32797    familiar 
   TABLE DATA           3   COPY public.familiar (nome, id_pessoa) FROM stdin;
    public          postgres    false    216   �       �           0    0    categoria_id_categoria_seq    SEQUENCE SET     I   SELECT pg_catalog.setval('public.categoria_id_categoria_seq', 29, true);
          public          postgres    false    217            �           0    0    despesa_id_despesa_seq    SEQUENCE SET     E   SELECT pg_catalog.setval('public.despesa_id_despesa_seq', 14, true);
          public          postgres    false    219            �           0    0    familiar_id_pessoa_seq    SEQUENCE SET     E   SELECT pg_catalog.setval('public.familiar_id_pessoa_seq', 10, true);
          public          postgres    false    215            *           2606    32809    categoria categoria_pkey 
   CONSTRAINT     `   ALTER TABLE ONLY public.categoria
    ADD CONSTRAINT categoria_pkey PRIMARY KEY (id_categoria);
 B   ALTER TABLE ONLY public.categoria DROP CONSTRAINT categoria_pkey;
       public            postgres    false    218            ,           2606    49198    despesa despesa_pkey 
   CONSTRAINT     Z   ALTER TABLE ONLY public.despesa
    ADD CONSTRAINT despesa_pkey PRIMARY KEY (id_despesa);
 >   ALTER TABLE ONLY public.despesa DROP CONSTRAINT despesa_pkey;
       public            postgres    false    220            (           2606    32802    familiar familiar_pkey 
   CONSTRAINT     [   ALTER TABLE ONLY public.familiar
    ADD CONSTRAINT familiar_pkey PRIMARY KEY (id_pessoa);
 @   ALTER TABLE ONLY public.familiar DROP CONSTRAINT familiar_pkey;
       public            postgres    false    216            -           2606    49199    despesa fk_categoria    FK CONSTRAINT     �   ALTER TABLE ONLY public.despesa
    ADD CONSTRAINT fk_categoria FOREIGN KEY (id_categoria) REFERENCES public.categoria(id_categoria);
 >   ALTER TABLE ONLY public.despesa DROP CONSTRAINT fk_categoria;
       public          postgres    false    218    220    4650            .           2606    49204    despesa fk_pessoa    FK CONSTRAINT     |   ALTER TABLE ONLY public.despesa
    ADD CONSTRAINT fk_pessoa FOREIGN KEY (id_pessoa) REFERENCES public.familiar(id_pessoa);
 ;   ALTER TABLE ONLY public.despesa DROP CONSTRAINT fk_pessoa;
       public          postgres    false    4648    220    216            �   ;   x�N<�+%��Д�1'375�$���Ë�9M���K�9�̹|�R�8���b���� ��j      �      x������ � �      �   3   x��O��I��4���?�8�ӌ˹(��$3/�Ӝ+(5/�$�ӂ+F��� ;Y�     