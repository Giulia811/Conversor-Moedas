class ConverterMoedas {
    static double converterDolarParaDemaisMoedas(double quantidade, double taxaConversao) {
        return quantidade * taxaConversao;
    }

    static double converterMoedaParaDolar(double quantidade, double taxaConversao) {
        return quantidade / taxaConversao;
    }
}

