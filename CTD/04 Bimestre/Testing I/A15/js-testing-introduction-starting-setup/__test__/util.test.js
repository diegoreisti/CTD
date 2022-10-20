const { generateText } = require('../util.js');

test('Saída de nome e idade', () => {
    const text = generateText('Diego', 35);
    expect(text).toBe('Diego (35 years old)');
});

